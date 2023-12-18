package de.dhbw.assignments.bankmanager.exceptions;

/**
 * Zeigt an, dass ein ung&uuml;ltiger Betrag verwendet wurde.
 */
public class IllegalAmountException extends Exception
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public IllegalAmountException(final String p_message)
	{
		super(p_message);
	}

	public IllegalAmountException()
	{
	}
}
