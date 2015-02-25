package it.fmuia.web.libraryejb;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class LibraryBeanTwo implements LibraryTwoIFace
{
	@EJB
	private LibrarySingletonBean singleton;

	@Override
	public void setText(String text)
	{
		singleton.setText(text);
	}

	@Override
	public String getText()
	{
		return singleton.getText();
	}

}
