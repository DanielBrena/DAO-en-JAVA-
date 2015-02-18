package mx.edu.ulsaoxaca.sistema.dao;

public class Usuario {
	private String id;
	private String nombre;
	private String correoElectronico;
	
	public Usuario(){}
	
	public Usuario(String id, String nombre, String correoElectronico) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.correoElectronico = correoElectronico;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre
				+ ", correoElectronico=" + correoElectronico + "]";
	}
	
	
	
}
