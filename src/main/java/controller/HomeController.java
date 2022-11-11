package controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/inicio")
public class HomeController extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
       
	
    public HomeController() {
        super();
    }


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Llamo a index directamente y muestro su contenido.
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

}
