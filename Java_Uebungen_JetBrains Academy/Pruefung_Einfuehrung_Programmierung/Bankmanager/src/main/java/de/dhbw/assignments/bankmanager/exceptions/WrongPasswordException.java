package de.dhbw.assignments.bankmanager.exceptions;

/**
 * Zeigt an, dass ein verwendetes Passwort falsch ist oder nicht existiert.
 */
public class WrongPasswordException extends Exception
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public WrongPasswordException()
	{
	}

	public WrongPasswordException(final String p_errorMessage)
	{
		super(p_errorMessage);
	}
}
