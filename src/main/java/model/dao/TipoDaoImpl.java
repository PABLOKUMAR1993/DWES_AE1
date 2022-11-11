package model.dao;
import java.util.ArrayList;
import java.util.List;
import model.beans.Tipo;


public class TipoDaoImpl implements IntTipoDao {

	
	// Atributos.
	
	
	private List<Tipo> listado;

	
	// Métodos Propios.
	
	
	public TipoDaoImpl() {
		
		listado = new ArrayList<>();
		cargarDatos();
		
	}
	
	private void cargarDatos() {
		
		listado.add( new Tipo(01, "CONCIERTO", "Conciertos de cantantes.") );
		listado.add( new Tipo(02, "DESPEDIDA", "Despedida de soltero.") );
		listado.add( new Tipo(03, "CUMPLEAÑOS", "Cumpleaños para todas las edades.") );
		listado.add( new Tipo(04, "BODA", "Bodas en igesia o judicial.") );
		
	}
	
	
	// Méotodos de la Interfaz.
	
	
	@Override
	public Tipo buscarUno(int idTipo) {
		
		// Almaceno la posición del indice del evento.
		Tipo aux = new Tipo();
		aux.setIdTipo(idTipo);
		int pos = listado.indexOf(aux);
		
		// Si se ha encontrado uno igual devuelve el objeto que estaba en dicha posición.
		if (pos == -1) {
			return null;
		} else {
			return listado.get(pos);
		}

	}

	@Override
	public List<Tipo> buscarTodos() {
		
		//Devuelve todos los Tipos.
		return listado;
		
	}
	
	
}
