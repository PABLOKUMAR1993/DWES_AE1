package model.beans;
import java.io.Serializable;

public class Tipo implements Serializable {


	// Atributos.
	
	
	private static final long serialVersionUID = 1L;
	private int idTipo;
	private String nombre;
	private String descripcion;
	
	
	// Constructores.
	
	
	public Tipo() {
		super();
	}
	
	public Tipo(int idTipo, String nombre, String descripcion) {
		super();
		this.idTipo = idTipo;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	
	// Getters & Setters
	
	
	public int getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
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

	
	// hasCode & equeals.
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idTipo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Tipo))
			return false;
		Tipo other = (Tipo) obj;
		if (idTipo != other.idTipo)
			return false;
		return true;
	}
	
	
	// toString
	

	@Override
	public String toString() {
		return "Tipo [idTipo=" + idTipo + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	
	
}
