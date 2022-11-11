package model.dao;
import java.util.List;
import model.beans.Evento;

public interface IntEventoDao {

	
	Evento buscarUno(int idEvento);
	List<Evento> buscarTodos();
	
	boolean crearEvento(Evento evento);
	boolean editarEvento(Evento evento);
	boolean eliminarEvento(int idEvento);
	boolean eliminarEvento(Evento evento);
	boolean cancelarEvento(Evento evento);
	
	
}
