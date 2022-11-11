package controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.beans.Evento;
import model.dao.EventoDaoImpl;
import model.dao.IntEventoDao;


@WebServlet("/eventos")
public class GestionEventos extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	
	// Creo la lista de Eventos cómo una variable global,
	// para que todos los métodos trabajen sobre la misma lista.
	IntEventoDao evento = new EventoDaoImpl();
	List<Evento> listado = evento.buscarTodos();
	
	
    public GestionEventos() {
        super();
    }

    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String opcion = request.getParameter("opcion");
		
		//Todas las llamadas que me entren, entrarán por aquí y las reparto al método correspondiente.
		switch (opcion) {
			case "editar":
				eventoEditar(request, response);
				break;
			case "eliminar":
				eventoEliminar(request, response);
				break;
			case "cancelar":
				eventoCancelar(request, response);
				break;
			case "alta":
				eventoCrear(request, response);
				break;
			case "activos":
				eventoActivos(request, response);
				break;
			case "todos":
				eventoTodos(request, response);
				break;
			case "activar":
				eventoActivar(request, response);
				break;
			default:
				System.out.println("Error: " + opcion);	
		}
		
	}

	
	private void eventoEditar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Almaceno el Evento elegido mediante su ID.
		int id = Integer.parseInt(request.getParameter("id"));
		IntEventoDao intEvento = new EventoDaoImpl();
		Evento evento = intEvento.buscarUno(id);
		
		//Guardo el evento cómo un atributo y se lo paso a la página jsp.
		request.setAttribute("editarEvento", evento);
		request.getRequestDispatcher("editarEvento.jsp").forward(request, response);
		
	}

	
	private void eventoEliminar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Almaceno el ID.
		int id = Integer.parseInt(request.getParameter("id"));
		
		// Almaceno el evento elegido.
		Evento eventoElegido = evento.buscarUno(id);
		
		// Elimino el evento indicado.
		listado.remove(eventoElegido);
		
		// Vuelvo a publicar la lista y recargo la página.
		request.setAttribute("eventos", listado);
		request.getRequestDispatcher("todos.jsp").forward(request, response);
		
	}
	
	
	private void eventoCancelar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Almaceno el ID.
		int id = Integer.parseInt(request.getParameter("id"));
		
		// Almaceno el evento elegido.
		Evento eventoElegido = evento.buscarUno(id);
		
		// Modifico el estado del objeto.
		eventoElegido.setEstado("inactivo");
		
		//Obtengo el indice del elemento a cancelar y lo sobre escribo en la lista.
		int index = listado.indexOf(eventoElegido);
		listado.set(index, eventoElegido);
		
		// Vuelvo a publicar la lista y recargo la página.
		request.setAttribute("eventos", listado);
		request.getRequestDispatcher("todos.jsp").forward(request, response);
		
	}
	
	//Este método es identico a canclear evento, no me costaba nada implementarlo y creo que es útil.
	private void eventoActivar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Almaceno el ID.
		int id = Integer.parseInt(request.getParameter("id"));
		
		// Almaceno el evento elegido.
		Evento eventoElegido = evento.buscarUno(id);
		
		// Modifico el estado del objeto.
		eventoElegido.setEstado("activo");
		
		//Obtengo el indice del elemento a cancelar y lo sobre escribo en la lista.
		int index = listado.indexOf(eventoElegido);
		listado.set(index, eventoElegido);
		
		// Vuelvo a publicar la lista y recargo la página.
		request.setAttribute("eventos", listado);
		request.getRequestDispatcher("todos.jsp").forward(request, response);
		
	}
	
	private void eventoCrear(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Abrimos la página "altaEvento", sin más, por ahora no funciona el formulario.
		request.getRequestDispatcher("altaEvento.jsp").forward(request, response);
		
	}
	
	private void eventoActivos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Le paso la lista de todos los Eventos y muestro a "activos.jsp".
		request.setAttribute("eventos", listado);
		request.getRequestDispatcher("activos.jsp").forward(request, response);
		
	}
	
	private void eventoTodos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Le paso la lista de todos los Eventos y muestro a "todos.jsp".
		request.setAttribute("eventos", listado);
		request.getRequestDispatcher("todos.jsp").forward(request, response);
		
	}
	
	
}
