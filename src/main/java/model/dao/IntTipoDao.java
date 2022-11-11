package model.dao;
import java.util.List;
import model.beans.Tipo;


public interface IntTipoDao {

	
	// Cuando tengo que crear un Evento,
	// utilizo este método para identificar al "Tipo de Evento" mediante su ID.
	Tipo buscarUno(int idTipo);
	
	// Este lo implemento por si acaso, es muy rápido y fácil de escribir.
	List<Tipo> buscarTodos();
	
}
