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
		response.getOutputStream().println("<h1>Test con proprietà statica</h1>");
		response.getOutputStream().println("<h2>Salve utente</h2>");
		String text = library.getText();
		if (text == null)
		{
			response.getOutputStream().println("<h3>La proprietà text non è settata</h3>");
		}
		else
		{
			response.getOutputStream().println("<h3>La proprietà text contiene " + text + "</h3>");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}
