package Modelo;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloUsuario extends Conexion {

	public ArrayList<Usuario> getUsuarios() {
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT * FROM usuarios");

			ResultSet resultado = pst.executeQuery();

			while (resultado.next()) {
				Usuario usuario = new Usuario();

				usuario.setId(resultado.getInt("id"));
				usuario.setNombre(resultado.getString("nombre"));
				usuario.setPassword(resultado.getString("password"));
				usuario.setFecha_login(resultado.getDate("fecha_login"));

				usuarios.add(usuario);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuarios;
	}

	public void eliminarUsuarios(int id) {

		try {

			PreparedStatement pst = conexion.prepareStatement("DELETE FROM usuarios WHERE id = ?");
			pst.setInt(1, id);

			pst.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void ainadirUsuario(Usuario usuario) {
		try {

			
			PreparedStatement pst = conexion.prepareStatement("INSERT INTO usuarios (nombre, password, fecha_login) VALUES(?,?,?)");
			pst.setString(1, usuario.getNombre());
			pst.setString(2, usuario.getPassword());
			pst.setDate(3, new Date(usuario.getFecha_login().getTime()));

			pst.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void modificarUsuario(Usuario usuario) {
		try {

			PreparedStatement pst = conexion.prepareStatement("UPDATE usuarios SET nombre=?, password=?, fecha_login=? WHERE id=?");
			pst.setString(1, usuario.getNombre());
			pst.setString(2, usuario.getPassword());
			pst.setDate(3, new Date(usuario.getFecha_login().getTime()));
			pst.setInt(4, usuario.getId());

			pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Usuario getUsuario(int id) throws SQLException {

		Usuario usuario = new Usuario();

		PreparedStatement pst = conexion.prepareStatement("SELECT * FROM usuarios WHERE id=?");
		pst.setInt(1, id);
		ResultSet resultado = pst.executeQuery();

		resultado.next();
		usuario.setId(resultado.getInt("id"));
		usuario.setNombre(resultado.getString("nombre"));
		usuario.setPassword(resultado.getString("password"));
		usuario.setFecha_login(resultado.getDate("fecha_login"));

		return usuario;
	}

}
