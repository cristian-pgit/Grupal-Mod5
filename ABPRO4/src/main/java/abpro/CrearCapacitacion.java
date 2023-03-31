package abpro;

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

import dao.CapacitacionDAO;
import idao.CapacitacionDaoImpl;


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
		agregarCapacitacion(cap);
		response.sendRedirect("crearcapacitacion.jsp");
	}


	private void agregarCapacitacion(Capacitacion cap) {
		CapacitacionDAO cdao = new CapacitacionDaoImpl();
		cdao.insertCapacitacion(cap);	
	}


	private Capacitacion setCapacitacion(HttpServletRequest request) {
		String idCapa  = request.getParameter("idCapacitacion");
		String rutCliente = request.getParameter("rutCliente");
		String dia = request.getParameter("dia");
		String hora = request.getParameter("hora");
		String lugar = request.getParameter("lugar");
		String duracion = request.getParameter("duracion");
		String cantAsist = request.getParameter("cantAsist");
		
		Capacitacion cap = new Capacitacion();
		cap.setIdCapacitacion(Integer.parseInt(idCapa));
		cap.setRutCliente(Integer.parseInt(rutCliente));
		cap.setDia(dia);
		cap.setHora(hora);
		cap.setLugar(lugar);
		cap.setDuracion(Integer.parseInt(duracion));
		cap.setCantAsist(Integer.parseInt(cantAsist));
		return cap;
	}


	private Date getDateHora(String hora, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			return sdf.parse(hora);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
