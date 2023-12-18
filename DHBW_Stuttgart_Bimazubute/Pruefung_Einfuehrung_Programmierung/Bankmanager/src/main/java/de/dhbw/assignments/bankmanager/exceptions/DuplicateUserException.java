package de.dhbw.assignments.bankmanager.exceptions;

/**
 * Zeigt an, dass ein Kunde bereits im System existiert.
 */
public class DuplicateUserException extends Exception
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public DuplicateUserException(final String p_errorMessage)
	{
		super(p_errorMessage);
	}

	public DuplicateUserException()
	{
	}
}
