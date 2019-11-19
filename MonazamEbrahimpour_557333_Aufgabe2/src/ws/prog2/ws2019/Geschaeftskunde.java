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

public class Geschaeftskunde extends Kunde {

	private String firmennamen;

	private Zahlungsmethode zahlungsmethode;

	/**
	 * @param kundennummer        	Die Kundennummer der Geschaeftkunde         
	 * @param vorname				Der Vorname der Geschaeftkunde 				
	 * @param nachname				Der Naname der Geschaeftkunde				
	 * @param anrede				Die Anrede (Frau,Herr, D) der Geschaeftkunde
	 * @param geburtsdatum			Das Geburtsdatum der Geschaeftkunde
	 * @param email					Die Emailaddresse der Geschaeftkunde
	 * @param telNummer				Die Telefonnummer der Geschaeftkunde
	 * @param privateAdresse		Die Privataddresse der Geschaeftkunde
	 * @param zahlenMethoden 		Die Zahlungsmethode der Geschaeftkunde
	 * Der Konstruktor mit den Variablen die initialisiert werden.
	 */
	public Geschaeftskunde(int kundennummer, String vorname, String nachname, String anrede, Date geburtsdatum,
			String email, String telNummer, Address privateAdresse, String firmennamen, boolean post) {
		// Supper muss immer als erster sein.
		super(kundennummer, vorname, nachname, anrede, geburtsdatum, email, telNummer, privateAdresse);

		// der rest nacht super() .

		this.firmennamen = firmennamen;

		if (post == true) {

			zahlungsmethode = new Zahlungsmethode("Rechnung", "Post");
		} else {
			zahlungsmethode = new Zahlungsmethode("Rechnung", "E-Mail");

		}

	}

	/**
	 * Die Methode gibt den Wert der Variable firmennamen zurück.
	 * 
	 * @return der Wert der Variable firmennamen
	 */
	public String getFirmennamen() {
		return firmennamen;
	}

	/**
	 * Der Wert der Variable firmennamen wird durch den Wert des Parameters
	 * überschrieben
	 * 
	 * @param firmennamen neuer Wert überschreibt firmennamen
	 */
	public void setFirmennamen(String firmennamen) {
		this.firmennamen = firmennamen;
	}

	/**
	 * Die Methode gibt den Wert der Variable zahlungsmethode zurück.
	 * 
	 * @return der Wert der Variable zahlungsmethode
	 */
	public Zahlungsmethode getZahlungsmethode() {
		return zahlungsmethode;
	}

	/**
	 * Der Wert der Variable zahlungsmethode wird durch den Wert des Parameters
	 * überschrieben
	 * 
	 * @param zahlungsmethode neuer Wert überschreibt zahlungsmethode
	 */
	public void setZahlungsmethode(Zahlungsmethode zahlungsmethode) {
		this.zahlungsmethode = zahlungsmethode;
	}

}
