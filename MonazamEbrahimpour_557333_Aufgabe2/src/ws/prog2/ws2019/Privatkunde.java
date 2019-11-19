/**
 * 
 */
package ws.prog2.ws2019;

import java.util.Date;

/**
 * @author shiva Monazam Ebrahimpour MatrikelNummer:557333
 * @version Eclips 2018-12 (4.10.0)
 * @since jdkversion jdk-11.0.2 Erstellungsdatum:
 */

public class Privatkunde extends Kunde{

	private Zahlungsmethode[] zahlungsmethoden;
	
	
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
	 **/
	public Privatkunde(int kundennummer, String vorname, String nachname, String anrede, Date geburtsdatum,
			String email, String telNummer, Address privateAdresse, Zahlungsmethode[] zahlungsmethoden) {
		
		
		
		super(kundennummer, vorname, nachname, anrede, geburtsdatum, email, telNummer, privateAdresse);
		this.zahlungsmethoden = zahlungsmethoden;
	
	
	}

}
