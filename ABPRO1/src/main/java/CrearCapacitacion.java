

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CrearCapacitacion")
public class CrearCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public CrearCapacitacion() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out;
		out = response.getWriter();
		
		response.setContentType("text/html");
		
		out.println("<html>");
		out.println("<head> <meta> <title> Piker Dans Les Youx </title> <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\" crossorigin=\"anonymous\"> <head>");
		out.println("<body>");
		out.println("<nav class=\"navbar navbar-expand-lg bg-body-tertiary\">\r\n"
				+ "  <div class=\"container-fluid\">\r\n"
				+ "    <a class=\"navbar-brand\" href=\"Inicio\">Navbar</a>\r\n"
				+ "    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n"
				+ "      <span class=\"navbar-toggler-icon\"></span>\r\n"
				+ "    </button>\r\n"
				+ "    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n"
				+ "      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n"
				+ "        <li class=\"nav-item\">\r\n"
				+ "          <a class=\"nav-link active\" aria-current=\"page\" href=\"Inicio\">Home</a>\r\n"
				+ "        </li>\r\n"
				+ "        <li class=\"nav-item\">\r\n"
				+ "          <a class=\"nav-link\" href=\"Contacto\">Contacto</a>\r\n"
				+ "        </li>\r\n"
				+ "	<li class=\"nav-item\">\r\n"
				+ "          <a class=\"nav-link\" href=\"CrearCapacitacion\">Crear Capacitacion</a>\r\n"
				+ "        </li>\r\n"
				+ "      <form class=\"d-flex\" role=\"search\">\r\n"
				+ "        <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n"
				+ "        <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\r\n"
				+ "      </form>\r\n"
				+ "    </div>\r\n"
				+ "  </div>\r\n"
				+ "</nav>");
		out.println("<div class=\"mb-3\">\r\n"
				+ "            <label for=\"exampleFormControlInput1\" class=\"form-label\"> Ingresa Id de Capacitacion </label>\r\n"
				+ "            <input type=\"int\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"1\">\r\n"
				+ "          </div>\r\n"
				+ "          <div class=\"mb-3\">\r\n"
				+ "            <label for=\"exampleFormControlInput1\" class=\"form-label\"> Ingresa Rut Cliente </label>\r\n"
				+ "            <input type=\"int\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"XXXXXXXX\">\r\n"
				+ "          </div>\r\n"
				+ "          <div class=\"mb-3\">\r\n"
				+ "            <label for=\"exampleFormControlInput1\" class=\"form-label\"> Ingresa Nombres de Cliente </label>\r\n"
				+ "            <input type=\"int\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"1\">\r\n"
				+ "          </div>");
		out.println("</body>");
		out.println("</html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}