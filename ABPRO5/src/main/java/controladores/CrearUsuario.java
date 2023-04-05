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

import implementacion.CapacitacionDaoImpl;
import implementacion.UsuarioDaoImpl;
import interfaces.CapacitacionDAO;
import interfaces.UsuarioDAO;


public class CrearUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CrearUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

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
		String perfil = request.getParameter("tipo");
		if(idUser == null||userName ==null|| password==null||fechaNac==null||run==null) {
			System.out.println("formulario con campos vacio");	
		} else {
			user = new Usuario();
			try {
				user.setIdUsuario(Integer.parseInt(idUser)); 
				user.setUserName(userName);
				user.setPassword(password);
				user.setfNacimiento(fechaNac);
				user.setRun(Integer.parseInt(run));
				user.setPerfil(perfil);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}
		return user;
	}
	
//	private Date getDate(String fecha) {
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		try {
//			return sdf.parse(fecha);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		return null;
//	}

}
