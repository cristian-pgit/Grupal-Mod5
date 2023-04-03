package controladores;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Capacitacion;
import model.Usuario;

import java.io.IOException;
import java.util.List;

import implementacion.UsuarioDaoImpl;
import interfaces.UsuarioDAO;


public class ListarUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ListarUsuarios() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Usuario> users = mostrarUsuarios();
		request.setAttribute("usuarios", users);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/listarusuarios.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private List<Usuario> mostrarUsuarios() {
		UsuarioDAO cdao = new UsuarioDaoImpl();
		List<Usuario> users = cdao.getAllUsuario();
		
		return users;
		
	}

}
