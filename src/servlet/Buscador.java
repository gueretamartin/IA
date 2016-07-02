package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.Grafo;

/**
 * Servlet implementation class Buscador
 */
@WebServlet("/Buscador")
public class Buscador extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Buscador() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ciudaduno = request.getParameter("sel1");
		String ciudaddos = request.getParameter("sel2");
		String[] rutas = {"010100","001000","000000","000011","000001","000000"};
		Grafo g = new Grafo(rutas);
		
		request.setAttribute("respuesta", g.existe(ciudaduno, ciudaddos));
		request.setAttribute("ciudado", ciudaduno);
		request.setAttribute("ciudadd", ciudaddos);
		request.getRequestDispatcher("respuesta.jsp").forward(request,response);
		}

}
