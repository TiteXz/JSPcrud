package Modelo;

public class Roles {

	private int id_rol;
	private String nombre_rol;
	
	public Roles() {}

	public Roles(int id_rol, String nombre_rol) {
		super();
		this.id_rol = id_rol;
		this.nombre_rol = nombre_rol;
	}

	public int getId() {
		return id_rol;
	}

	public void setId(int id_rol) {
		this.id_rol = id_rol;
	}

	public String getNombre() {
		return nombre_rol;
	}

	public void setNombre(String nombre_rol) {
		this.nombre_rol = nombre_rol;
	}

	@Override
	public String toString() {
		return "Roles [id_rol=" + id_rol + ", nombre_rol=" + nombre_rol + "]";
	}
	
	
}
