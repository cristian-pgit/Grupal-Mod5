package controladores;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Capacitacion;
import model.Usuario;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import dao.CapacitacionDAO;
import dao.UsuarioDAO;
import idao.CapacitacionDaoImpl;
import idao.UsuarioDaoImpl;

/**
 * Servlet implementation class CrearUsuario
 */
public class CrearUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Usuario user = setUsuario(request);
		try {
			agregarUsuario(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("crearusuario.jsp");
	}

	private void agregarUsuario(Usuario user) {
		UsuarioDAO udao = new UsuarioDaoImpl();
		udao.insertUsuario(user);	
	}
	
	private Usuario setUsuario(HttpServletRequest request) {
		Usuario user = null;
		String idUser  = request.getParameter("idUser");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String fechaNac = request.getParameter("fechaNac");
		String run = request.getParameter("run");
		if(idUser == null||userName ==null|| password==null||fechaNac==null||run==null) {
			System.out.println("formulario con campos vacio");	
		} else {
			user = new Usuario();
			try {
				user.setIdUsuario(Integer.parseInt(idUser)); 
				user.setUserName(userName);
				user.setPassword(password);
				user.setfNacimiento(getDate(fechaNac));
				user.setRun(Integer.parseInt(run));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}
		return null;
	}
	
	private Date getDate(String fecha) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			return sdf.parse(fecha);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
