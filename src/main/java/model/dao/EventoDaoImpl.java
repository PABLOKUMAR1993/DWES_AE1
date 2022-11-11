package model.dao;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.beans.Evento;


public class EventoDaoImpl implements IntEventoDao {

	
	// Atributos.
	
	
	private List<Evento> listado;
	
	
	// Métodos Propios.
	
	
	public EventoDaoImpl() {
		
		listado = new ArrayList<>();
		cargarDatos();
		
	}
	
	private void cargarDatos() {
		
		//Necesito esta variable para tener disponibles los "tipos" de eventos.
		IntTipoDao tipos = new TipoDaoImpl();
		
		//Lleno LISTADO de eventos ficticios.
		listado.add( new Evento(01, "Boda de Thor y Freyja", "Se van a casar los gatos Thor y Freyja", new Date(), 12,
				"En casa de Thor", "activo", 'n', 300, 50, 150, tipos.buscarUno(04) ) );
		listado.add( new Evento(02, "Cumpleaños de Thor y Freyja", "Se van a celebrar el cumple de los gatos Thor y Freyja", new Date(), 9,
				"En casa de Freyja", "activo", 's', 100, 10, 50, tipos.buscarUno(03) ) );
		listado.add( new Evento(03, "Despedida de Thor y Freyja", "Se van a celebrar la despedida de la boda de los gatos Thor y Freyja",
				new Date(), 16, "En casa de Freyja", "activo", 's', 400, 40, 50, tipos.buscarUno(02) ) );
		listado.add( new Evento(04, "Concierto de la Boda de los gatos Thor y Freyja", "Se van a celebrar un concierto para Thor y Freyja",
				new Date(), 12, "En el patio de Thor", "inactivo", 'n', 500, 25, 35, tipos.buscarUno(01) ) );
		
	}
	
	
	// Métodos de la Interfaz.
	
	
	@Override
	public Evento buscarUno(int idEvento) {
		
		//almaceno la posición del indice del evento.
		Evento aux = new Evento();
		aux.setIdEvento(idEvento);
		int index = listado.indexOf(aux);
		
		//Si se ha encontrado uno igual devuelve el objeto que estaba en dicha posición.
		if (index == -1) {
			return null;
		} else {
			return listado.get(index);
		}

	}

	@Override
	public List<Evento> buscarTodos() {
		
		//Devuelvo todos.
		return listado;
		
	}

	@Override
	public boolean crearEvento(Evento evento) {
		
		//Si no hay dos iguales, se añade el evento y devuelve ture.
		if (listado.contains(evento)) {
			return false;
		} else {
			listado.add(evento);
			return true;
		}
		
	}

	@Override
	public boolean editarEvento(Evento evento) {
		
		//Almaceno el indice de la posición del evento recibido.
		int index = listado.indexOf(evento);
		
		//Si existe lo sobre escribo con el nuevo y devuelvo true.
		if (index == -1) {
			return false;
		} else {
			listado.set(index, evento);
			return true;
		}
		
	}

	@Override
	public boolean eliminarEvento(int idEvento) {
		
		//almaceno la posición del indice del evento que contiene el id pasado.
		Evento aux = new Evento();
		aux.setIdEvento(idEvento);
		int index = listado.indexOf(aux);
		
		//si existe, le paso a remove el indice del objeto que hay que eliminar.
		if (index == -1) {
			return false;
		} else {
			listado.remove(index);
			return true;
		}
		
	}
	
	@Override
	public boolean eliminarEvento(Evento evento) {
		
		//Si lo encuentra y elimina devuelve true.
		return listado.remove(evento) ? true : false;
		
	}

	@Override
	public boolean cancelarEvento(Evento evento) {
		
		//Guardo la posición del indice del evento
		int pos = listado.indexOf(evento);
		//Si el evento existe, modifico su estado a inactivo y devuelvo true.
		if (pos == -1) {
			return false;
		} else {
			evento.setEstado("inactivo");
			listado.set(pos, evento);
			return true;
		}

	}

	
	
}
