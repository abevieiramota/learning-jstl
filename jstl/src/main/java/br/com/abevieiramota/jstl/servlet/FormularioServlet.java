package br.com.abevieiramota.jstl.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@SuppressWarnings("serial")
@WebServlet("/formulario")
public class FormularioServlet extends HttpServlet {

	protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp)
			throws javax.servlet.ServletException, java.io.IOException {

		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/formulario.jsp");
		dispatcher.forward(req, resp);
	};
}
