package controladores;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelo.Conexion;
import Modelo.ModeloRol;
import Modelo.ModeloUsuario;
import Modelo.Usuario;

/**
 * Servlet implementation class ModificarUsuario
 */
@WebServlet("/ModificarUsuario")
public class ModificarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//datuak jaso
	   
		
		int id = Integer.parseInt(request.getParameter("id"));
		String nombre = request.getParameter("nombre");
		String password = request.getParameter("password");
		SimpleDateFormat fecha_login = new SimpleDateFormat("yyyy-MM-dd");
		int id_rol = Integer.parseInt(request.getParameter("id_rol"));
		String nom_rol = request.getParameter("rol");
		
		ModeloUsuario mU = new ModeloUsuario();
		ModeloRol  mR = new ModeloRol();
		
		Usuario usu = new Usuario();
		usu.setId(id);
		usu.setNombre(nombre);
		usu.setPassword(password);
		try {
			usu.setFecha_login(fecha_login.parse(request.getParameter("fecha_login")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mR.conectar();
		usu.setId_rol(mR.getRol(nom_rol).getId());
		mR.cerrar();
		
		//update
		mU.conectar();
		mU.modificarUsuario(usu);
		mU.cerrar();
		request.getRequestDispatcher("VerUsuarios").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
