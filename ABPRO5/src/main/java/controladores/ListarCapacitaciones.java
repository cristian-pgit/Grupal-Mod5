package controladores;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Capacitacion;


import java.io.IOException;
import java.util.List;

import implementacion.CapacitacionDaoImpl;
import interfaces.CapacitacionDAO;


public class ListarCapacitaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ListarCapacitaciones() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Capacitacion> capacitaciones = mostrarCapacitaciones();
		request.setAttribute("capacitaciones", capacitaciones);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/listarcapacitaciones.jsp");
		rd.forward(request, response);
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private List<Capacitacion> mostrarCapacitaciones() {
		CapacitacionDAO cdao = new CapacitacionDaoImpl();
		List<Capacitacion> capacitaciones = cdao.getAllCapacitaciones();
		
		return capacitaciones;
		
	}

}
