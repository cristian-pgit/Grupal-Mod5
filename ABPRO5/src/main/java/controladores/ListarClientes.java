package controladores;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cliente;

import java.io.IOException;
import java.util.List;

import implementacion.ClienteDaoImpl;
import interfaces.ClienteDao;

/**
 * Servlet implementation class ListarClientes
 */
public class ListarClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListarClientes() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Cliente> clientes = mostrarClientes();
		request.setAttribute("clientes", clientes);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/ListarCliente.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private List<Cliente> mostrarClientes() {
		ClienteDao clidao = new ClienteDaoImpl();
		List<Cliente> clientes = clidao.getAllCliente();

		return clientes;

	}

}
