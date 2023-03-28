package controladores;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelo.ModeloUsuario;
import Modelo.Usuario;

/**
 * Servlet implementation class AñadirUsuario
 */
@WebServlet("/AñadirUsuario")
public class AinadirUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AinadirUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
		
		request.getRequestDispatcher("VistaAñadirUsuario.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		String nombre = request.getParameter("nombre");
		String password = request.getParameter("password");
		SimpleDateFormat fecha_login = new SimpleDateFormat("yyyy-MM-dd");
		
		ModeloUsuario mU = new ModeloUsuario();
		
		Usuario usu = new Usuario();
		usu.setNombre(nombre);
		usu.setPassword(password);
		try {
			usu.setFecha_login(fecha_login.parse(request.getParameter("fecha_login")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mU.conectar();
		mU.ainadirUsuario(usu);
		mU.cerrar();
		
	}

}
