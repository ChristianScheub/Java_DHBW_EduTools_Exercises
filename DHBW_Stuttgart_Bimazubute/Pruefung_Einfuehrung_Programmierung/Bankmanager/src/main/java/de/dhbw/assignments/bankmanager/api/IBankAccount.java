package de.dhbw.assignments.bankmanager.api;

import java.util.ArrayList;

/**
 * Dieses Interface beschreibt ein Konto.
 *
 */
public interface IBankAccount
{
	/**
	 * Methode liefert die Kontonummer zurück.
	 *
	 * @return Kontonummer
	 */
	int getAccountNumber();

	/**
	 * Methode set Kontonummer des Kontos.
	 *
	 */
	void setAccountNumber(int accountNumber);


	/**
	 * Methode legt das Saldo des Kontos fest
	 *
	 */
	void setBalance(float balance);


	/**
	 * Methode liefert das Saldo des Kontos zurück
	 *
	 * @return Saldo des Kontos
	 */
	float getBalance();

	/**
	 * Methode liefert die Email des Kontoinhabers zurück.
	 * @return
	 */
	String getEmail();

	/**
	 * Die Methode legt die Email des Kontoinhabers fest.
	 * @param email
	 */
	void setEmail(String email);

	/**
	 * Die Methode liefert den Kontoinhaber zurück.
	 * @return
	 */
	String getAccountOwner();

	/**
	 * Die Methode legt die Kontoinhaber fest.
	 * @param accountOwner
	 */
	void setAccountOwner(String accountOwner);

	/**
	 * Die Methode liefert ein verschlüsseltes Passwort zu einem eingegebenen Passwort.
	 * Folgendes Verschlüsselungsverfahren soll verwendet werden:
	 *   - Zahlen werden durch Hashtags (#) ersetzt
	 *   - Buchstaben werden in Kleinschreibung überführt
	 *   - Leerräume werden durch Sterne (*) ersetzt.
	 * 	 - Die ursprüngliche Zeichenkette wird in umgekehrter Reihenfolge zurückgeliefert
	 * 	 - Beispiel H2llo Welt => tlew*oll#h
	 *
	 * @param passwort das Passwort,das verschlüsselt werden soll.
	 * @return verschlüsselte Passwort.
	 */
	String generateEncryptedPassword(String passwort) ;




}
