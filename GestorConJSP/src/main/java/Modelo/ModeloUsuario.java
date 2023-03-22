package Modelo;

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

	public void ainadirUsuario(String nombre, String password) {
		try {

			PreparedStatement pst = conexion.prepareStatement("INSERT INTO usuarios (nombre, password) VALUES(?,?)");
			pst.setString(1, nombre);
			pst.setString(2, password);

			pst.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void modificarUsuario(String nombre, String password, int id) {
		try {

			PreparedStatement pst = conexion.prepareStatement("UPDATE usuarios SET nombre=?, password=? WHERE id=?");
			pst.setString(1, nombre);
			pst.setString(2, password);
			pst.setInt(3, id);

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

		return usuario;
	}

}
