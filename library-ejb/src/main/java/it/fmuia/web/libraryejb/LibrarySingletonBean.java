package it.fmuia.web.libraryejb;

import javax.ejb.Singleton;

@Singleton
public class LibrarySingletonBean
{
	private String text;

	public String getText()
	{
		return text;
	}

	public void setText(String text)
	{
		this.text = text;
	}

}
