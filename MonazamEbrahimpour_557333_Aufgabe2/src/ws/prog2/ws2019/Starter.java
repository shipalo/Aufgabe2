/**
 * 
 */
package ws.prog2.ws2019;

import ws.prog2.ws2019.test.TestDaten;

/**
 * @author shiva Monazam Ebrahimpour MatrikelNummer:557333
 * @version Eclips 2018-12 (4.10.0)
 * @since jdkversion jdk-11.0.2 Erstellungsdatum:16.11.2019
 *
 * 
 */
public class Starter {

	public static void main(String[] args) {
		/*
		 * 
		 * Für den Test der Anwendung ist die „Magic Holidays Reiseagentur“ mit der
		 * UST-IDNR DE812524001 und der Adresse Hauptstraße 5a, 10559 Berlin zu
		 * erzeugen. Die Reiseagentur soll drei unterschiedliche Kunden haben. Die
		 * Objekte sollen im Code in der Starter Klasse instanziiert werden. Es ist
		 * aktuell kein Einlesen der Daten über die Konsole notwendig.
		 * 
		 */

		TestDaten testDaten = new TestDaten();
				
		int anzahlKunden = 5;
		Kunde[] kunden = testDaten.erstelleKunden(anzahlKunden);
		

		Address adresse = new Address("Hauptstraße", "5a", "10559", "Berlin");
		Reisebuero reisebuero = new Reisebuero("Magic Holidays Reiseagentur", "DE812524001",
				"Magic-Holidays-Reiseagentur@email.de", adresse, kunden);

		Kunde[] reisebueroKunden = reisebuero.getKunden();
		for (int i = 0; i < reisebueroKunden.length; i++) {
			System.out.println(reisebueroKunden[i].toString());
		}
		System.out.println();
		System.out.println("-----------------------------");
		MenuSteuerung steuerung = new MenuSteuerung();
		steuerung.addTestDaten(reisebueroKunden, testDaten.erstelleReservierung(4));
		steuerung.showMenu();
		while(!steuerung.getProgrammbeenden()) {
			steuerung.menusteuerung();
			
		}
		

	}

}
