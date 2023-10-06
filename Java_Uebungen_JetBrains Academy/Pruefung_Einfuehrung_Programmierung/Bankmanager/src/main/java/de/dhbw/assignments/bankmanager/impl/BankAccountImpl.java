package de.dhbw.assignments.bankmanager.impl;

import de.dhbw.assignments.bankmanager.api.IBankAccount;

public class BankAccountImpl implements IBankAccount {

	/**
	 * Konstruktor bitte nicht löschen
	 */
	public BankAccountImpl(){}

	@Override
	public int getAccountNumber()
	{
		//TODO: Diesen Kommentar und die nachfolgende Code-Zeile bitte loeschen
		throw new UnsupportedOperationException();
	}

	/**
	 * Methode set Kontonummer des Kontos.
	 *
	 * @param accountNumber
	 */
	@Override
	public void setAccountNumber(int accountNumber) {
		//TODO: Diesen Kommentar und die nachfolgende Code-Zeile bitte loeschen
		throw new UnsupportedOperationException();
	}

	/**
	 * Methode legt das Saldo des Kontos fest
	 *
	 * @param balance
	 * @return Saldo des Kontos
	 */
	@Override
	public void setBalance(float balance) {
		//TODO: Diesen Kommentar und die nachfolgende Code-Zeile bitte loeschen
		throw new UnsupportedOperationException();
	}

	/**
	 * Methode liefert das Saldo des Kontos zurück
	 *
	 * @return Saldo des Kontos
	 */
	@Override
	public float getBalance() {
		//TODO: Diesen Kommentar und die nachfolgende Code-Zeile bitte loeschen
		throw new UnsupportedOperationException();
	}

	/**
	 * Methode liefert die Email des Kontoinhabers zurück.
	 *
	 * @return
	 */
	@Override
	public String getEmail() {
		//TODO: Diesen Kommentar und die nachfolgende Code-Zeile bitte loeschen
		throw new UnsupportedOperationException();
	}

	/**
	 * Die Methode legt die Email des Kontoinhabers fest.
	 *
	 * @param email
	 */
	@Override
	public void setEmail(String email) {
		//TODO: Diesen Kommentar und die nachfolgende Code-Zeile bitte loeschen
		throw new UnsupportedOperationException();

	}

	/**
	 * Die Methode liefert den Kontoinhaber zurück.
	 *
	 * @return
	 */
	@Override
	public String getAccountOwner() {
		//TODO: Diesen Kommentar und die nachfolgende Code-Zeile bitte loeschen
		throw new UnsupportedOperationException();
	}

	/**
	 * Die Methode legt die Kontoinhaber fest.
	 *
	 * @param accountOwner
	 */
	@Override
	public void setAccountOwner(String accountOwner) {
		//TODO: Diesen Kommentar und die nachfolgende Code-Zeile bitte loeschen
		throw new UnsupportedOperationException();
	}

	/**
	 * Die Methode liefert ein verschlüsseltes Passwort zu einem eingegebenen Passwort.
	 * Folgendes Verschlüsselungsverfahren soll verwendet werden:
	 * - Zahlen werden durch Hashtags (#) ersetzt
	 * - Buchstaben werden in Kleinschreibung überführt
	 * - Leerräume werden durch Sterne (*) ersetzt.
	 * - Die ursprüngliche Zeichenkette wird in umgekehrter Reihenfolge zurückgeliefert
	 * - Beispiel H2llo Welt => tlew*oll#h
	 *
	 * @param passwort das Passwort,das verschlüsselt werden soll.
	 * @return verschlüsselte Passwort.
	 */
	@Override
	public String generateEncryptedPassword(String passwort) {
		//TODO: Diesen Kommentar und die nachfolgende Code-Zeile bitte loeschen
		throw new UnsupportedOperationException();

	}


}
