package controladores;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Usuario;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import implementacion.UsuarioDaoImpl;
import interfaces.UsuarioDAO;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String USUARIO = "admin";
	private static final String PASS = "1234";

	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out;
		out = response.getWriter();
		HttpSession session = request.getSession();
		String userName = request.getParameter("userName");
		String pass = request.getParameter("floatingPassword");
		
		boolean esUsuarioValido = validarUsuarioYPass(userName, pass);
		if (esUsuarioValido) {
			System.out.println("El usuario es correcto"+". Se ha conectado:"+userName);
			session.setAttribute("userName", userName);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/inicio.jsp");
			rd.forward(request, response);
		} else {
			System.out.println("El usuario o pass Incorrecto");
			response.sendRedirect("error.jsp");
		}
	}


	private boolean validarUsuarioYPass(String userName, String pass) {
		if (obtenerUsuario(userName, pass) != null) {
			return obtenerUsuario(userName, pass) != null;
		} else {
			return userName.equals(USUARIO) && pass.equals(PASS);
		}
	}
	
	private Usuario obtenerUsuario(String userName, String pass) {
		UsuarioDAO udao = new UsuarioDaoImpl();
		Usuario user = udao.getUsuarioByNameandPass(userName, pass);
		
		return user;
		
	}


}
