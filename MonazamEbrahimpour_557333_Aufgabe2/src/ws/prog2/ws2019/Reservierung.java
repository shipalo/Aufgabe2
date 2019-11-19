/**
 * 
 */
package ws.prog2.ws2019;
/**
 * @author shiva Monazam Ebrahimpour MatrikelNummer:557333
 * @version Eclips 2018-12 (4.10.0)
 * @since jdkversion jdk-11.0.2 Erstellungsdatum:16.11.2019
 *
 * 
 */
import java.util.Date;

public abstract class Reservierung {
	
	// Jeder Reservierung hat eine Reservierungsnummer, Datum, und eine Summe.
	
	
	private String reservierungsnummer ;
	private Date datum;
	private double summe;
	
	/**
	 * @param reservierungsnummer
	 * @param datum
	 * @param summe
	 * Der Konstruktor mit den Variablen die initialisiert werden.
	 */
	public Reservierung(String reservierungsnummer, Date datum, double summe) {
		this.reservierungsnummer = reservierungsnummer;
		this.datum = datum;
		this.summe = summe;
	}

	/** 
	 * Die Methode gibt den Wert der Variable reservierungsnummer zurück.
	 * @return der Wert der Variable reservierungsnummer
	 */
	public String getReservierungsnummer() {
		return reservierungsnummer;
	}

	/** 
	 * Der Wert der Variable reservierungsnummer wird durch den Wert des Parameters überschrieben
	 * @param reservierungsnummer neuer Wert überschreibt reservierungsnummer 
	 */
	public void setReservierungsnummer(String reservierungsnummer) {
		this.reservierungsnummer = reservierungsnummer;
	}

	/** 
	 * Die Methode gibt den Wert der Variable datum zurück.
	 * @return der Wert der Variable datum
	 */
	public Date getDatum() {
		return datum;
	}

	/** 
	 * Der Wert der Variable datum wird durch den Wert des Parameters überschrieben
	 * @param datum neuer Wert überschreibt datum 
	 */
	public void setDatum(Date datum) {
		this.datum = datum;
	}

	/** 
	 * Die Methode gibt den Wert der Variable summe zurück.
	 * @return der Wert der Variable summe
	 */
	public double getSumme() {
		return summe;
	}

	/** 
	 * Der Wert der Variable summe wird durch den Wert des Parameters überschrieben
	 * @param summe neuer Wert überschreibt summe 
	 */
	public void setSumme(double summe) {
		this.summe = summe;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "reservierungsnummer=" + reservierungsnummer + ", datum=" + datum + ", summe=" + summe;
	}
	
	
	
}
