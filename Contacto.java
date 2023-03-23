
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Contacto
 */
public class Contacto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Contacto() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out;
		out = response.getWriter();

		response.setContentType("text/html");

		out.println("<html>");
		out.println(
				"<head> <meta> <title>  </title> <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\" crossorigin=\"anonymous\"> <head>");
		out.println("<body>");
		out.println("<nav class=\"navbar navbar-expand-lg bg-body-tertiary\">\r\n"
				+ "  <div class=\"container-fluid\">\r\n" + "    <a class=\"navbar-brand\" href=\"#\">Navbar</a>\r\n"
				+ "    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n"
				+ "      <span class=\"navbar-toggler-icon\"></span>\r\n" + "    </button>\r\n"
				+ "    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n"
				+ "      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n" + "        <li class=\"nav-item\">\r\n"
				+ "          <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Home</a>\r\n"
				+ "        </li>\r\n" + "        <li class=\"nav-item\">\r\n"
				+ "          <a class=\"nav-link\" href=\"#\">Link</a>\r\n" + "        </li>\r\n"
				+ "        <li class=\"nav-item dropdown\">\r\n"
				+ "          <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n"
				+ "            Dropdown\r\n" + "          </a>\r\n" + "          <ul class=\"dropdown-menu\">\r\n"
				+ "            <li><a class=\"dropdown-item\" href=\"#\">Action</a></li>\r\n"
				+ "            <li><a class=\"dropdown-item\" href=\"#\">Another action</a></li>\r\n"
				+ "            <li><hr class=\"dropdown-divider\"></li>\r\n"
				+ "            <li><a class=\"dropdown-item\" href=\"#\">Something else here</a></li>\r\n"
				+ "          </ul>\r\n" + "        </li>\r\n" + "        <li class=\"nav-item\">\r\n"
				+ "          <a class=\"nav-link disabled\">Disabled</a>\r\n" + "        </li>\r\n" + "      </ul>\r\n"
				+ "      <form class=\"d-flex\" role=\"search\">\r\n"
				+ "        <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n"
				+ "        <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\r\n"
				+ "      </form>\r\n" + "    </div>\r\n" + "  </div>\r\n" + "</nav>\r\n"
				+ "<div class=\"container\">\r\n" + "    <div class=\"row\">\r\n"
				+ "        <div class=\"col-md-12\">\r\n" + "            <div class=\"well well-sm\">\r\n"
				+ "                <form class=\"form-horizontal\" method=\"post\">\r\n"
				+ "                    <fieldset>\r\n"
				+ "                        <legend class=\"text-center header\">Contactanos</legend>\r\n" + "\r\n"
				+ "                        <div class=\"form-group\">\r\n"
				+ "                            <div class=\"col-md-8\">\r\n"
				+ "                                <input id=\"fname\" name=\"name\" type=\"text\" placeholder=\"Nombres\" class=\"form-control\">\r\n"
				+ "                            </div>\r\n" + "                        </div>\r\n"
				+ "                        <div class=\"form-group\">\r\n"
				+ "                            <div class=\"col-md-8\">\r\n"
				+ "                                <input id=\"lname\" name=\"name\" type=\"text\" placeholder=\"Apellidos\" class=\"form-control\">\r\n"
				+ "                            </div>\r\n" + "                        </div>\r\n" + "\r\n"
				+ "                        <div class=\"form-group\">\r\n"
				+ "                            <div class=\"col-md-8\">\r\n"
				+ "                                <input id=\"email\" name=\"email\" type=\"text\" placeholder=\"Direccion de correo\" class=\"form-control\">\r\n"
				+ "                            </div>\r\n" + "                        </div>\r\n" + "\r\n"
				+ "                        <div class=\"form-group\">\r\n"
				+ "                            <div class=\"col-md-8\">\r\n"
				+ "                                <input id=\"phone\" name=\"phone\" type=\"text\" placeholder=\"Telefono\" class=\"form-control\">\r\n"
				+ "                            </div>\r\n" + "                        </div>\r\n" + "\r\n"
				+ "                        <div class=\"form-group\">\r\n"
				+ "                            <div class=\"col-md-8\">\r\n"
				+ "                                <textarea class=\"form-control\" id=\"message\" name=\"message\" placeholder=\"Ingresa tu mensaje. Te contactaremos a la brevedad\" rows=\"7\"></textarea>\r\n"
				+ "                            </div>\r\n" + "                        </div>\r\n" + "\r\n"
				+ "                        <div class=\"form-group\">\r\n"
				+ "                            <div class=\"col-md-12 text-center\">\r\n"
				+ "                                <button type=\"submit\" class=\"btn btn-primary btn-lg\">Enviar</button>\r\n"
				+ "                            </div>\r\n" + "                        </div>\r\n"
				+ "                    </fieldset>\r\n" + "                </form>\r\n" + "            </div>\r\n"
				+ "        </div>\r\n" + "    </div>\r\n" + "</div>");
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

}
