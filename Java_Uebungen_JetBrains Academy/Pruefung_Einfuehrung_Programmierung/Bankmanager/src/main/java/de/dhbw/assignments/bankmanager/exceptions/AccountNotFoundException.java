package de.dhbw.assignments.bankmanager.exceptions;

/**
 * Zeigt an, dass ein Konto nicht existiert.
 */
public class AccountNotFoundException extends Exception
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public AccountNotFoundException(final String p_errorMessage)
	{
		super(p_errorMessage);
	}

	public AccountNotFoundException()
	{
	}
}
