package abpro;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    // Obtener los valores del formulario
		    String username = request.getParameter("username");
		    String password = request.getParameter("password");

		    // Validar el nombre de usuario y contraseña
		    if (username != null && password != null && username.equals("admin") && password.equals("1234")) {
		        // Si los datos son correctos, iniciar sesión y redirigir al usuario a la página de inicio
		        request.getSession().setAttribute("username", username);
		        response.sendRedirect("Inicio.jsp");
		    } else {
		        // Si los datos son incorrectos, mostrar un mensaje de error y redirigir al usuario de nuevo a la página de inicio de sesión
		        request.setAttribute("error", "Nombre de usuario o contraseña incorrectos");
		        request.getRequestDispatcher("Login.jsp").forward(request, response);
		    }
		}

}


