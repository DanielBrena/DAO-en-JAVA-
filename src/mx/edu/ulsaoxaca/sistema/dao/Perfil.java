package mx.edu.ulsaoxaca.sistema.dao;

public class Perfil {
	private String id;
	private String nombre;
	private String descripcion;
	
	public Perfil(){
		
	}
	public Perfil(String id, String nombre, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Perfil [id=" + id + ", nombre=" + nombre + ", descripcion="
				+ descripcion + "]";
	}
	
	
}
