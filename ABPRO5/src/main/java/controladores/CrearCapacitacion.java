package controladores;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Capacitacion;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import implementacion.CapacitacionDaoImpl;
import interfaces.CapacitacionDAO;


public class CrearCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public CrearCapacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Capacitacion cap = setCapacitacion(request);
		try {
			agregarCapacitacion(cap);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("crearcapacitacion.jsp");
	}


	private void agregarCapacitacion(Capacitacion cap) {
		CapacitacionDAO cdao = new CapacitacionDaoImpl();
		cdao.insertCapacitacion(cap);	
	}


	private Capacitacion setCapacitacion(HttpServletRequest request) {
		Capacitacion cap = null;
		String idCapa  = request.getParameter("idCapacitacion");
		String rutCliente = request.getParameter("rutCliente");
		String dia = request.getParameter("dia");
		String hora = request.getParameter("hora");
		String lugar = request.getParameter("lugar");
		String duracion = request.getParameter("duracion");
		String cantAsist = request.getParameter("cantAsist");
		if(idCapa == null||rutCliente ==null|| hora==null||lugar==null||duracion==null||cantAsist==null) {
			System.out.println("formulario con campos vacio");	
		} else {
			cap = new Capacitacion();
			try {
				cap.setIdCapacitacion(Integer.parseInt(idCapa));
				cap.setRutCliente(Integer.parseInt(rutCliente));
				cap.setDia(dia);
				cap.setHora(hora);
				cap.setLugar(lugar);
				cap.setDuracion(Integer.parseInt(duracion));
				cap.setCantAsist(Integer.parseInt(cantAsist));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}
		return cap;
	}


	
	
	

}
