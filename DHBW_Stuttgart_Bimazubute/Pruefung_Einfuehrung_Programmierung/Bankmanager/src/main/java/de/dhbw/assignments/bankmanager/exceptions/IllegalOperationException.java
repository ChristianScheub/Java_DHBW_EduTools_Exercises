package de.dhbw.assignments.bankmanager.exceptions;

/**
 * Zeigt an, dass eine Operation nicht ausgef&uuml;hrt werden kann.
 */
public class IllegalOperationException extends Exception
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public IllegalOperationException(final String p_errorMessage)
	{
		super(p_errorMessage);
	}

	public IllegalOperationException()
	{
	}
}
