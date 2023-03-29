package controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelo.ModeloRol;
import Modelo.ModeloUsuario;
import Modelo.Roles;
import Modelo.Usuario;

/**
 * Servlet implementation class AbrirJSP
 */
@WebServlet("/VerUsuarios")
public class VerUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerUsuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ModeloUsuario moUsu = new ModeloUsuario();
		ModeloRol mR = new ModeloRol();
		
		mR.conectar();
		ArrayList<Roles> roles = mR.getRoles();
		mR.cerrar();
		
		moUsu.conectar();
		ArrayList<Usuario> usuarios = moUsu.getUsuarios();
		moUsu.cerrar();
		
		request.setAttribute("roles", roles);
		request.setAttribute("usuarios", usuarios);
		request.getRequestDispatcher("VistaUsuarios.jsp").forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
