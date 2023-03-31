package Modelo;

import java.util.Date;

public class Usuario {

	
	private int id;
	private String nombre;
	private String password;
	private Date fecha_login;
	private int id_rol;
	private Roles rol;
	
	public Usuario() {}
	
	public Usuario(int id, String nombre, Date fecha_login, String password, int id_rol) {
		this.id = id;
		this.nombre = nombre;
		this.fecha_login = fecha_login;
		this.password = password;
		this.id_rol = id_rol;
		
	}


	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha_login() {
		return fecha_login;
	}

	public void setFecha_login(Date fecha_login) {
		this.fecha_login = fecha_login;
	}
	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public int getId_rol() {
		return id_rol;
	}

	public void setId_rol(int id_rol) {
		this.id_rol = id_rol;
	}

	@Override
	public String toString() {
		return "Usuario: id=" + id + ", nombre=" + nombre + " ,password=" + password + ", fecha_login=" + fecha_login + ", id_rol=" + id_rol;
	}

	
	
}
