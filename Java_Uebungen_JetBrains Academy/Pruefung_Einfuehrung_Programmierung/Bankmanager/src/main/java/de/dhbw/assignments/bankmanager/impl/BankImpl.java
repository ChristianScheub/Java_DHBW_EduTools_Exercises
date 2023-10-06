package de.dhbw.assignments.bankmanager.impl;

import de.dhbw.assignments.bankmanager.api.IBank;
import de.dhbw.assignments.bankmanager.api.IBankAccount;
import de.dhbw.assignments.bankmanager.exceptions.AccountNotFoundException;
import de.dhbw.assignments.bankmanager.exceptions.IllegalAmountException;
import de.dhbw.assignments.bankmanager.exceptions.IllegalOperationException;

import java.util.ArrayList;
import java.util.Comparator;

public class BankImpl implements IBank {
	/**
	 * Konstruktor bitte nicht löschen
	 */
	public BankImpl() {}


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
	 * @return Kontonummer des neu hinzugefügten Kontos.
	 */
	@Override
	public int addAccount(IBankAccount account) {
		//TODO: Diesen Kommentar und die nachfolgende Code-Zeile bitte loeschen
		throw new UnsupportedOperationException();
	}

	/**
	 * Sperrt ein Konto im Banksystem.
	 * Wenn ein Konto gesperrt ist, dann kann von diesem Konto keine
	 * Einzahlung, keine Abhebung und keine Überweisung durchgeführt werden.
	 *
	 * @param account Konto, das gesperrt werden soll.
	 * @throws AccountNotFoundException wird ausgelöst, falls das Konto im Banksystem nicht vorhanden ist.
	 */
	@Override
	public void blockAccount(IBankAccount account) throws AccountNotFoundException {
		//TODO: Diesen Kommentar und die nachfolgende Code-Zeile bitte loeschen
		throw new UnsupportedOperationException();
	}

	/**
	 * Liefert die Liste der gesperrten Kunden zurück.
	 *
	 * @return Liste der gesperrten Kunden oder eine leere Liste
	 */
	@Override
	public ArrayList<IBankAccount> getBlockedAccounts() {
		//TODO: Diesen Kommentar und die nachfolgende Code-Zeile bitte loeschen
		throw new UnsupportedOperationException();
	}

	/**
	 * Mit dieser Methode kann ein Betrag auf ein Konto eingezahlt werden.
	 * Dieser Betrag wird zusätzlich in die Liste der Transaktionen des Kontos erfasst.
	 * Hinweis: Im Fall einer Einzahlung muss bei der Erstellung einer Instanz der Klasse TransactionImpl ein positiver Betrag übergeben werden.
	 *
	 * @param account das Zielkonto für die Einzahlung.
	 * @param amount  Betrag, der eingezahlt werden soll.
	 * @throws IllegalOperationException wird ausgelöst, falls das Konto gesperrt ist.
	 * @throws IllegalAmountException    Exception wird in folgenden Fällen ausgelöst:
	 *                                   <ul>
	 *                                   <li>Der Betrag ist negativ</li>
	 *                                   </ul>
	 */
	@Override
	public void deposit(IBankAccount account, float amount) throws IllegalOperationException, IllegalAmountException {
		//TODO: Diesen Kommentar und die nachfolgende Code-Zeile bitte loeschen
		throw new UnsupportedOperationException();
	}

	/**
	 * Mit dieser Methode kann ein Betrag vom Konto abgehoben werden.
	 * Dieser abgehobene Betrag wird zusätzlich in die Liste der Transaktionen des Kontos erfasst.
	 * Hinweis: Im Fall einer Abhebung muss bei der Erstellung einer Instanz der Klasse TransactionImpl ein negativer Betrag übergeben werden.
	 *
	 * @param account Konto von dem der Betrag abgehoben werden soll.
	 * @param amount  Betrag, der abgehoben werden soll.
	 * @throws IllegalOperationException wird ausgelöst, falls das Konto gesperrt ist.
	 * @throws IllegalAmountException    Exception wird in folgenden Fällen ausgelöst:
	 *                                   <ul>
	 *                                   <li>Der Betrag ist negativ</li>
	 *                                   <li>Der Betrag ist höher als der maximal zulässige Betrag. Dieser liegt bei 5000</li>
	 *                                   <li>Das Guthaben reicht nicht aus</li>
	 *                                   </ul>
	 */
	@Override
	public void withdraw(IBankAccount account, float amount) throws IllegalOperationException, IllegalAmountException {
	    //TODO: Diesen Kommentar und die nachfolgende Code-Zeile bitte loeschen
		throw new UnsupportedOperationException();
	}

	/**
	 * Methode liefert alle im System vorhandenen Bankkonten.
	 *
	 * @return Im System vorhandene Konten.
	 */
	@Override
	public ArrayList<IBankAccount> getAccounts() {
		//TODO: Diesen Kommentar und die nachfolgende Code-Zeile bitte loeschen
		throw new UnsupportedOperationException();
	}

	/**
	 * Sortiert die Konten anhand der Kontonummer in absteigender Reihenfolge
	 *
	 * @return Sortierte Liste aller Konten im Banksystem oder eine leere Liste
	 */
	@Override
	public ArrayList<IBankAccount> sortAccountsByAccountNumberDesc() {
		//TODO: Diesen Kommentar und die nachfolgende Code-Zeile bitte loeschen
		throw new UnsupportedOperationException();
	}

	/**
	 * Liefert das Konto mit dem höchsten Kontostand (Saldo) zurück.
	 *
	 * @return das Konto mit dem hächsten Kontostand
	 */
	@Override
	public IBankAccount getMaxBalance() {
		//TODO: Diesen Kommentar und die nachfolgende Code-Zeile bitte loeschen
		throw new UnsupportedOperationException();
	}

	/**
	 * Liefert den Durchschnitt der Kontostände aller Konten im Banksystem.
	 *
	 * @return Durchschnitt der Kontostände aller Konten im Banksystem
	 */
	@Override
	public float getAverageBalance() {
		//TODO: Diesen Kommentar und die nachfolgende Code-Zeile bitte loeschen
		throw new UnsupportedOperationException();
	}
}
