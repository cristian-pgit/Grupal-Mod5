

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/contacto")
public class Contacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Contacto() {
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
				+ "        <div class=\"container-fluid\">\r\n"
				+ "          <a class=\"navbar-brand\" href=\"Inicio\">PDLY</a>\r\n"
				+ "          <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n"
				+ "            <span class=\"navbar-toggler-icon\"></span>\r\n"
				+ "          </button>\r\n"
				+ "          <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n"
				+ "            <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n"
				+ "              <li class=\"nav-item\">\r\n"
				+ "                <a class=\"nav-link active\" aria-current=\"page\" href=\"Inicio\">Home</a>\r\n"
				+ "              </li>\r\n"
				+ "              <li class=\"nav-item\">\r\n"
				+ "                <a class=\"nav-link\" href=\"Contacto\">Contacto</a>\r\n"
				+ "              </li>\r\n"
				+ "              <li class=\"nav-item dropdown\">\r\n"
				+ "                <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n"
				+ "                  Crear\r\n"
				+ "                </a>\r\n"
				+ "                <ul class=\"dropdown-menu\">\r\n"
				+ "                  <li><a class=\"dropdown-item\" href=\"CrearCapacitacion\">Crear Capacitacion</a></li>\r\n"
				+ "                  <li><a class=\"dropdown-item\" href=\"#\">Crear Cliente</a></li>\r\n"
				+ "                  <li><a class=\"dropdown-item\" href=\"#\">Crear Profesional</a></li>\r\n"
				+ "                  <li><a class=\"dropdown-item\" href=\"#\">Crear Administrativo</a></li>\r\n"
				+ "                  <li><hr class=\"dropdown-divider\"></li>\r\n"
				+ "                  <li><a class=\"dropdown-item\" href=\"#\">Something else here</a></li>\r\n"
				+ "                </ul>\r\n"
				+ "              </li>\r\n"
				+ "            </ul>\r\n"
				+ "            <form class=\"d-flex\" role=\"search\">\r\n"
				+ "              <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n"
				+ "              <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\r\n"
				+ "            </form>\r\n"
				+ "          </div>\r\n"
				+ "        </div>\r\n"
				+ "      </nav>");
		out.println("<div class=\"container-fluid\">\r\n"
				+ "        <div class=\"row text-center\">\r\n"
				+ "            <div class=\"col-sm-3\"></div>\r\n"
				+ "            <div class=\"col-sm-6\">\r\n"
				+ "                <div class=\"well well-sm \">\r\n"
				+ "                    <form class=\"form-horizontal\" method=\"post\">\r\n"
				+ "                        <fieldset>\r\n"
				+ "                            <legend class=\"text-center header\">Contactanos</legend>\r\n"
				+ "    \r\n"
				+ "                            <div class=\"form-group justify-content-center\">\r\n"
				+ "                                <span class=\"col-md-1 col-md-offset-2 text-center\"><i\r\n"
				+ "                                  class=\"fa fa-user bigicon\"></i></span>\r\n"
				+ "                                <div class=\"col-md-8 justify-content-center\">\r\n"
				+ "                                    <input id=\"fname\" name=\"name\" type=\"text\" placeholder=\"Nombres\" class=\"form-control\">\r\n"
				+ "                                </div>\r\n"
				+ "                            </div>\r\n"
				+ "                            <div class=\"form-group justify-content-center\">\r\n"
				+ "                                <span class=\"col-md-1 col-md-offset-2 text-center\"><i\r\n"
				+ "                                  class=\"fa fa-user bigicon\"></i></span>\r\n"
				+ "                                <div class=\"col-md-8 justify-content-center\">\r\n"
				+ "                                    <input id=\"lname\" name=\"name\" type=\"text\" placeholder=\"Apellidos\" class=\"form-control\">\r\n"
				+ "                                </div>\r\n"
				+ "                            </div>\r\n"
				+ "    \r\n"
				+ "                            <div class=\"form-group justify-content-center\">\r\n"
				+ "                                <span class=\"col-md-1 col-md-offset-2 text-center\"><i\r\n"
				+ "                                  class=\"fa fa-envelope-o bigicon\"></i></span>\r\n"
				+ "                                <div class=\"col-md-8 justify-content-center\">\r\n"
				+ "                                    <input id=\"email\" name=\"email\" type=\"text\" placeholder=\"Email\" class=\"form-control\">\r\n"
				+ "                                </div>\r\n"
				+ "                            </div>\r\n"
				+ "    \r\n"
				+ "                            <div class=\"form-group justify-content-center\">\r\n"
				+ "                                <span class=\"col-md-1 col-md-offset-2 text-center\"><i\r\n"
				+ "                                  class=\"fa fa-phone-square bigicon\"></i></span>\r\n"
				+ "                                <div class=\"col-md-8 justify-content-center\">\r\n"
				+ "                                    <input id=\"phone\" name=\"phone\" type=\"text\" placeholder=\"Numero Telefonico\" class=\"form-control\">\r\n"
				+ "                                </div>\r\n"
				+ "                            </div>\r\n"
				+ "    \r\n"
				+ "                            <div class=\"form-group\">\r\n"
				+ "                                <span class=\"col-md-1 col-md-offset-2 text-center\"><i\r\n"
				+ "                                  class=\"fa fa-pencil-square-o bigicon\"></i></span>\r\n"
				+ "                                <div class=\"col-md-8 justify-content-center\">\r\n"
				+ "                                    <textarea class=\"form-control\" id=\"message\" name=\"message\"\r\n"
				+ "                                    placeholder=\"Ingresa tu mensaje. Te responderemos a la brevedad.\"\r\n"
				+ "                                    rows=\"7\"></textarea>\r\n"
				+ "                                </div>\r\n"
				+ "                            </div>\r\n"
				+ "    \r\n"
				+ "                            <div class=\"form-group\">\r\n"
				+ "                                <div class=\"col-md-12 text-center\">\r\n"
				+ "                                    <button type=\"submit\" class=\"btn btn-primary btn-lg\">Submit</button>\r\n"
				+ "                                </div>\r\n"
				+ "                            </div>\r\n"
				+ "                        </fieldset>\r\n"
				+ "                    </form>\r\n"
				+ "                </div>\r\n"
				+ "            </div>\r\n"
				+ "            <div class=\"col-sm-3\"></div>\r\n"
				+ "        </div>\r\n"
				+ "    </div>");
		out.println("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN\" crossorigin=\"anonymous\"></script>");
		out.println("</body>");
		out.println("</html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
