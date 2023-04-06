package controladores;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Contacto;

import java.io.IOException;

import implementacion.ContactoDAOImpl;
import interfaces.ContactoDAO;

/**
 * Servlet implementation class CrearContacto
 */
public class CrearContacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearContacto() {
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
		Contacto cont= setContacto(request);
		try {
			agregarContacto(cont);
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("contacto.jsp");
	}

	private void agregarContacto(Contacto cont) {
		ContactoDAO codao= new ContactoDAOImpl();
		codao.insertContacto(cont);
		
	}

	private Contacto setContacto(HttpServletRequest request) {
		Contacto cont = null;
		String nombres = request.getParameter("name");
		String apellidos = request.getParameter("lname");
		String email = request.getParameter("email");
		String telefono = request.getParameter("phone");
		String mensaje = request.getParameter("message");
		if (nombres == null || apellidos == null || email == null || telefono == null || mensaje == null) {
			System.out.println("formulario con campos vacios");
			
		} else {
			cont = new Contacto();
			try {
				cont.setNombres(nombres);
				cont.setApellidos(apellidos);
				cont.setEmail(email);
				cont.setTelefono(Integer.parseInt(telefono));
				cont.setMensaje(mensaje);
			} catch(NumberFormatException e) {
				e.printStackTrace();
			}
		}
		
		return cont;
	}

}
