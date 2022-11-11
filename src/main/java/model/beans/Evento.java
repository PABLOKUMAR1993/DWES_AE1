package model.beans;
import java.io.Serializable;
import java.util.Date;

public class Evento implements Serializable {
	
	
	// Atributos.
	
	
	private static final long serialVersionUID = 1L;
	private int idEvento;
	private String nombre;
	private String descripcion;
	private Date fechaInicio;
	private int duracion;
	private String direccion;
	private String estado;
	private char destacado;
	private int aforoMaximo;
	private int minimoAsistencia;
	private double precioDecimal;
	private Tipo tipo;
	
	
	// Constructores.
	
	
	public Evento() {
		super();
	}
	
	public Evento(int idEvento, String nombre, String descripcion, Date fechaInicio, int duracion, String direccion,
			String estado, char destacado, int aforoMaximo, int minimoAsistencia, double precioDecimal, Tipo tipo) {
		super();
		this.idEvento = idEvento;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.duracion = duracion;
		this.direccion = direccion;
		this.estado = estado;
		this.destacado = destacado;
		this.aforoMaximo = aforoMaximo;
		this.minimoAsistencia = minimoAsistencia;
		this.precioDecimal = precioDecimal;
		this.tipo = tipo;
	}

	
	// Getters & Setters.
	
	
	public int getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
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

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public char getDestacado() {
		return destacado;
	}

	public void setDestacado(char destacado) {
		this.destacado = destacado;
	}

	public int getAforoMaximo() {
		return aforoMaximo;
	}

	public void setAforoMaximo(int aforoMaximo) {
		this.aforoMaximo = aforoMaximo;
	}

	public int getMinimoAsistencia() {
		return minimoAsistencia;
	}

	public void setMinimoAsistencia(int minimoAsistencia) {
		this.minimoAsistencia = minimoAsistencia;
	}

	public double getPrecioDecimal() {
		return precioDecimal;
	}

	public void setPrecioDecimal(double precioDecimal) {
		this.precioDecimal = precioDecimal;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	
	// hashCode & equeals.
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEvento;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Evento))
			return false;
		Evento other = (Evento) obj;
		if (idEvento != other.idEvento)
			return false;
		return true;
	}

	
	// toString
	
	
	@Override
	public String toString() {
		return "ID EVENTO: " + idEvento + "\n" +
				"NOMBRE EVENTO: " + nombre + "\n" +
				"DESCRIPCIÓN EVENTO: " + descripcion + "\n" +
				"FECHA INICIO EVENTO: " + fechaInicio + "\n" +
				"DURACIÓN EVENTO: " + duracion + "\n" +
				"DIRECCIÓN EVENTO: " + direccion + "\n" +
				"ESTADO EVENTO: " + estado + "\n" +
				"DESTACADO: " + destacado + "\n" +
				"AFORO MÁXIMO EVENTO: " + aforoMaximo + "\n" +
				"MÍNIMO ASISTENCIA EVENTO: " + minimoAsistencia + "\n" +
				"PRECIO EVENTO: " + precioDecimal + "\n" +
				"TIPO DE EVENTO: " + tipo.getNombre();
	}
		
	
}
