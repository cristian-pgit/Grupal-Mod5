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


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String USUARIO = "admin";
	private static final String PASS = "1234";

	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
			System.out.println("El usuario es correcto");
			session.setAttribute("userName", userName);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/inicio.jsp");
			rd.forward(request, response);
		} else {
			System.out.println("El usuario no es correcto");
			response.sendRedirect("error.jsp");
		}
		
		
	}


	private boolean validarUsuarioYPass(String userName, String pass) {
		return userName.equals(USUARIO) && pass.equals(PASS);
	}


}
