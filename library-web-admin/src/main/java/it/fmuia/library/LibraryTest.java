package it.fmuia.library;

import it.fmuia.web.libraryejb.LibraryIFace;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
@WebServlet("/LibraryTest")
public class LibraryTest extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	@EJB
	private LibraryIFace library;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		StringBuilder sb = new StringBuilder();
		sb.append("<h1>Test con proprietà statica</h1>");
		sb.append("<h2>SALVE ADMIN</h2>");
		sb.append("<h3>Clicca sul pulsante per settare Text con HELLO WORLD</h3>");
		sb.append("<form action=\"./LibraryTest\" method=\"post\">");
		sb.append("<input type=\"submit\" value=\"Procedi\">");
		sb.append("</form>");
		response.getOutputStream().println(sb.toString());

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		library.setText("HELLO WORLD");
		response.getOutputStream().println("La Proprietà è stata settata correttamente");
	}

}
