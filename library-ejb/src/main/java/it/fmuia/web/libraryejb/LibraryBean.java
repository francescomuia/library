package it.fmuia.web.libraryejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Remove;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Library
 */
@Stateless
public class LibraryBean implements LibraryIFace
{
	public static String text;

	@Override
	public void setText(String text)
	{
		LibraryBean.text = text;
	}

	@Override
	public String getText()
	{
		return text;
	}

	@Remove
	public void remove()
	{
		System.out.println("EJB RIMOSSO");
	}

	@PreDestroy
	public void preDestroy()
	{
		System.out.println("EJB LIBRARY DESTROYED");
	}

	@PostConstruct
	public void postConstruct()
	{
		System.out.println("EJB LIBRARY CONSTRUCTED");
	}

}
