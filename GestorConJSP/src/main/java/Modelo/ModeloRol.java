package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloRol extends Conexion{

	public ArrayList<Roles> getRoles (){
		ArrayList<Roles> roles = new ArrayList<Roles>();
		
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT * FROM roles");

			ResultSet resultado = pst.executeQuery();

			while (resultado.next()) {
				Roles rol = new Roles();

				rol.setId(resultado.getInt("id"));
				rol.setNombre(resultado.getString("nombre"));

				roles.add(rol);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return roles;
		
	}
	
	
	
	
	public Roles getRol(String nombre) {
		Roles rol = new Roles();
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT * FROM roles where nombre=?");
			pst.setString(1, nombre);

			ResultSet resultado = pst.executeQuery();
		
			resultado.next();
			
			rol.setNombre(resultado.getString("nombre"));
			rol.setId(resultado.getInt("id"));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rol;
	}
	
	public ArrayList<Roles> getNombre(int id_rol) {
		ArrayList<Roles> roles = new ArrayList<Roles>();
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT * FROM roles where id=?");
			pst.setInt(1, id_rol);

			ResultSet resultado = pst.executeQuery();
			
			while(resultado.next()) {
				Roles rol = new Roles();
			
			rol.setNombre(resultado.getString("nombre"));
			rol.setId(resultado.getInt("id"));
			
			roles.add(rol);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return roles;
	}
	
	
	
	
}
