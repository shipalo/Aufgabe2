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

public class Flugreservierung extends Reservierung {

	// Eine Flugreservierung hat Abflughafen, Zielflughafen, und Flugnummer.

	private String abflughafen;
	private String zielflughafen;
	private String flugnumer;

	/**
	 * @param reservierungsnummer
	 * @param datum
	 * @param summe		
	 *  Der Konstruktor mit den Variablen die initialisiert werden.
	 */
	public Flugreservierung(String reservierungsnummer, Date datum, double summe, String abflughafen,
			String zielflughafen, String flugnummer) {
		super(reservierungsnummer, datum, summe);
		this.abflughafen = abflughafen;
		this.zielflughafen = zielflughafen;
		this.flugnumer = flugnummer;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Flugreservierung: " + super.toString() + " abflughafen=" + abflughafen + ", zielflughafen=" + zielflughafen
				+ ", flugnumer=" + flugnumer;
	}

	/**
	 * Die Methode gibt den Wert der Variable abflughafen zurück.
	 * 
	 * @return der Wert der Variable abflughafen
	 */
	public String getAbflughafen() {
		return abflughafen;
	}

	/**
	 * Der Wert der Variable abflughafen wird durch den Wert des Parameters
	 * überschrieben
	 * 
	 * @param abflughafen neuer Wert überschreibt abflughafen
	 */
	public void setAbflughafen(String abflughafen) {
		this.abflughafen = abflughafen;
	}

	/**
	 * Die Methode gibt den Wert der Variable zielflughafen zurück.
	 * 
	 * @return der Wert der Variable zielflughafen
	 */
	public String getZielflughafen() {
		return zielflughafen;
	}

	/**
	 * Der Wert der Variable zielflughafen wird durch den Wert des Parameters
	 * überschrieben
	 * 
	 * @param zielflughafen neuer Wert überschreibt zielflughafen
	 */
	public void setZielflughafen(String zielflughafen) {
		this.zielflughafen = zielflughafen;
	}

	/**
	 * Die Methode gibt den Wert der Variable flugnumer zurück.
	 * 
	 * @return der Wert der Variable flugnumer
	 */
	public String getFlugnumer() {
		return flugnumer;
	}

	/**
	 * Der Wert der Variable flugnumer wird durch den Wert des Parameters
	 * überschrieben
	 * 
	 * @param flugnumer neuer Wert überschreibt flugnumer
	 */
	public void setFlugnumer(String flugnumer) {
		this.flugnumer = flugnumer;
	}

}
