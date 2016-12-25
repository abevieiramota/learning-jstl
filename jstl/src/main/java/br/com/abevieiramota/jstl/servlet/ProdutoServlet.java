package br.com.abevieiramota.jstl.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.abevieiramota.jstl.model.Produto;

@SuppressWarnings("serial")
@WebServlet("/produtos")
public class ProdutoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("produtos", Produto.all());
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/produtos.jsp");
		dispatcher.forward(req, resp);
	}
}
