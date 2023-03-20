package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloUsuario extends Conexion {

	public  ArrayList<Usuario> getUsuarios() {
		ArrayList<Usuario> usuarios= new ArrayList<Usuario>();
		
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT * FROM usuarios");
			
			ResultSet resultado = pst.executeQuery();
			
			while(resultado.next()) {
				Usuario usuario = new Usuario();
				
				usuario.setId(resultado.getInt("id"));
				usuario.setNombre(resultado.getString("nombre"));
				
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
	
	
	public void ainadirUsuario( String nombre) {
try {
			
			PreparedStatement pst = conexion.prepareStatement("INSERT INTO usuarios (nombre) VALUES(?)");
			pst.setString(1, nombre);
			
			pst.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
			}
	}
	
	
	public void modificarUsuario(String nombre, int id) {
try {
			
			PreparedStatement pst = conexion.prepareStatement("UPDATE usuarios SET nombre= ? WHERE id=?");
			pst.setString(1, nombre);
			pst.setInt(2, id);
			
			pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			}
	}
}
