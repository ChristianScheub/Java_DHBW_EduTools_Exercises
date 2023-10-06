package de.dhbw.assignments.bankmanager.api;

import de.dhbw.assignments.bankmanager.exceptions.*;

import java.util.ArrayList;

/**
 * Dieses Interface beschreibt die Funktionalität einer Klasse zur Verwaltung von Kunden,
 * Konten und Banktransaktionen verwendet wird.
 *
 */
public interface IBank
{






	/**
	 * Fügt ein Konto zum Banksystem hinzu.
	 *
	 * @param account Konto, das zum Banksystem hinzugefügt werden soll.
	 *                Konten bekommen die Kontonummer, die aufsteigend ab der Zahl 1 nummeriert sind.
	 *                Beispiel:
	 *                Wenn Sie ein erstes Konto zum Banksystem hinzufügen,
	 *                dann bekommt das Konto die Kontonummer 1.
	 *                Das zweite Konto bekommt die Kontonummer 2
	 *                und alle weiteren Konten bekommen aufsteigende Kontonummer.
	 *
	 * @return Kontonummer des neu hinzugefügten Kontos.
	 *
	 */
	int addAccount(IBankAccount account);

	/**
	 * Sperrt ein Konto im Banksystem.
	 * Wenn ein Konto gesperrt ist, dann kann von diesem Konto keine
	 * Einzahlung, keine Abhebung und keine Überweisung durchgeführt werden.
	 *
	 * @param account Konto, das gesperrt werden soll.
	 *
	 * @throws AccountNotFoundException wird ausgelöst, falls das Konto im Banksystem nicht vorhanden ist.
	 */
	void blockAccount(IBankAccount account) throws AccountNotFoundException;


	/**
	 * Liefert die Liste der gesperrten Kunden zurück.
	 *
	 * @return Liste der gesperrten Kunden oder eine leere Liste
	 */
	ArrayList<IBankAccount> getBlockedAccounts();


	/**
	 * Mit dieser Methode kann ein Betrag auf ein Konto eingezahlt werden.
	 * Dieser Betrag wird zusätzlich in die Liste der Transaktionen des Kontos erfasst.
	 * Hinweis: Im Fall einer Einzahlung muss bei der Erstellung einer Instanz der Klasse TransactionImpl ein positiver Betrag übergeben werden.
	 *
	 * @param account das Zielkonto für die Einzahlung.
	 * @param amount Betrag, der eingezahlt werden soll.
	 * @throws IllegalOperationException wird ausgelöst, falls das Konto gesperrt ist.
	 * @throws IllegalAmountException Exception wird in folgenden Fällen ausgelöst:
	 *                                <ul>
	 *                                <li>Der Betrag ist negativ</li>
	 *                                </ul>
	 */
	void deposit(IBankAccount account, float amount) throws  IllegalOperationException, IllegalAmountException;

	/**
	 * Mit dieser Methode kann ein Betrag vom Konto abgehoben werden.
	 * Dieser abgehobene Betrag wird zusätzlich in die Liste der Transaktionen des Kontos erfasst.
	 * Hinweis: Im Fall einer Abhebung muss bei der Erstellung einer Instanz der Klasse TransactionImpl ein negativer Betrag übergeben werden.
	 * @param account Konto von dem der Betrag abgehoben werden soll.
	 * @param amount Betrag, der abgehoben werden soll.

	 * @throws IllegalOperationException wird ausgelöst, falls das Konto gesperrt ist.
	 * @throws IllegalAmountException Exception wird in folgenden Fällen ausgelöst:
	 *                                <ul>
	 *                                <li>Der Betrag ist negativ</li>
	 *                                <li>Der Betrag ist höher als der maximal zulässige Betrag. Dieser liegt bei 5000</li>
	 *                                <li>Das Guthaben reicht nicht aus</li>
	 *                                </ul>
	 */
	void withdraw(IBankAccount account, float amount) throws IllegalOperationException, IllegalAmountException;


	/**
     * Methode liefert alle im System vorhandenen Bankkonten.
	 * @return Im System vorhandene Konten.
	 */

	ArrayList<IBankAccount> getAccounts();



	/**
	 * Sortiert die Konten anhand der Kontonummer in absteigender Reihenfolge
	 *
	 * @return Sortierte Liste aller Konten im Banksystem oder eine leere Liste
	 */
	ArrayList<IBankAccount> sortAccountsByAccountNumberDesc();

	/**
	 * Liefert das Konto mit dem höchsten Kontostand (Saldo) zurück.
	 * @return das Konto mit dem hächsten Kontostand
	 */
	IBankAccount getMaxBalance();


	/**
	 * Liefert den Durchschnitt der Kontostände aller Konten im Banksystem.
	 * @return Durchschnitt der Kontostände aller Konten im Banksystem
	 */
	float getAverageBalance();










}
