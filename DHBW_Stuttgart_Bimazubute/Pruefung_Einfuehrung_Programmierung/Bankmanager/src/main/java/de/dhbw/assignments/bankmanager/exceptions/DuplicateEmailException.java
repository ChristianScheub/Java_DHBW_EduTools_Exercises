package de.dhbw.assignments.bankmanager.exceptions;

/**
 * Zeigt an, dass eine EMail bereits verwendet wird.
 */
public class DuplicateEmailException extends Exception
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public DuplicateEmailException(final String p_errorMessage)
	{
		super(p_errorMessage);
	}

	public DuplicateEmailException()
	{
	}

}
