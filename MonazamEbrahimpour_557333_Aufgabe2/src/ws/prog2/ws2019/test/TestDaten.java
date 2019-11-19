/**
 * 
 */
package ws.prog2.ws2019.test;
/**
 * @author shiva Monazam Ebrahimpour MatrikelNummer:557333
 * @version Eclips 2018-12 (4.10.0)
 * @since jdkversion jdk-11.0.2 Erstellungsdatum:16.11.2019
 *
 * 
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import ws.prog2.ws2019.Address;
import ws.prog2.ws2019.Flugreservierung;
import ws.prog2.ws2019.Hotelreservierung;
import ws.prog2.ws2019.Kunde;
import ws.prog2.ws2019.Privatkunde;
import ws.prog2.ws2019.Reservierung;
import ws.prog2.ws2019.Zahlungsmethode;


public class TestDaten {

	private Random random = new Random();
	
	private String[] VORNAMEN_HERREN = { "Max", "Tom", "Paul", "Chris" };
	private String[] VORNAMEN_FRAUEN = { "Sarah", "Anna", "Lisa", "Christina" };
	
	private String[] NACHNAMEN = { "Muster", "Müller", "Schmidt", "Wenzel" };

	/**
	 * 
	 * Der Konstruktor mit den Variablen die initialisiert werden.
	 */
	public TestDaten() {
	}
	/**
	 * gibt die Daten von Kunden und Reisebuero aus
	 * */
	public Kunde[] erstelleKunden(int anzahlKunden) {
		Kunde[] neueKunden = new Kunde[anzahlKunden];
		for (int i = 0; i < anzahlKunden; i++) {
			int kundennummer = random.nextInt(8999) + 1000; // eine 4 stellige Kundennummer
			boolean mann_frau = random.nextBoolean();
			String anrede ="";
			if(mann_frau == true) {
				anrede = "Herr";
			}else {
				anrede = "Frau";
			}
    
			String vorname = "";
			if(anrede.equals("Herr")) {
				vorname = VORNAMEN_HERREN[random.nextInt(VORNAMEN_HERREN.length)];
			}else {
				vorname = VORNAMEN_FRAUEN[random.nextInt(VORNAMEN_FRAUEN.length)];
			}
			String nachname = NACHNAMEN[random.nextInt(NACHNAMEN.length)];
			int jahr = random.nextInt(50)+50; // bis 50 jahren, 

			Date geburtsdatum = new Date(jahr, random.nextInt(12)+1, random.nextInt(30));
			String email = vorname+"."+nachname+"@gmx.de";
			String telefonnummer = "0151"+random.nextInt(999999)+100000; // zusätzliche 6 zahlen
			
			String strasse = "Unter den Linden";
			String hausNr = "Nr " + random.nextInt(100);
			String plz = ""+ random.nextInt(99999)+1;
			String stadt = "Stadt "+ anzahlKunden;
			Address address = new Address(strasse, hausNr, plz, stadt);
			
			int anzahlZahlungsmethode = random.nextInt(3);
			Zahlungsmethode[] zahlungsmethoden = new Zahlungsmethode[anzahlZahlungsmethode];
			for (int j = 0; j < anzahlZahlungsmethode; j++) {
				zahlungsmethoden[j] = erstelleZahlungsmethode(email);
			}
			
			Kunde kunde = new Privatkunde(kundennummer, vorname, nachname, anrede, geburtsdatum, email, telefonnummer, address, zahlungsmethoden); // ein Kunde wurde erstellts
			neueKunden[i] = kunde; // kunde wurde in die Liste eingefügt
		}
		
		return neueKunden; // gib die liste der Kunde zurück
	}
	
	
	
	public Zahlungsmethode erstelleZahlungsmethode(String email) {
		String[] beschreibungen = {"Online-Banking", "Lastschrift", "Paypal"};
		
		String bezeichnung = "Konto: "+ email;
		Zahlungsmethode zahlungsmethode = new Zahlungsmethode(bezeichnung, beschreibungen[random.nextInt(beschreibungen.length)]);
		return zahlungsmethode;
	}
	
	public Reservierung[] erstelleReservierung(int anzahl) {
		Reservierung[] reservierungsListe= new Reservierung[2*anzahl];
		for (int i = 0; i < anzahl; i++) {
			String reservierungsnummer = "H"+ random.nextInt(1000)+1000;
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			
			Date datum = null;
			try {
				datum = dateFormat.parse("20-11-2019");
			} catch (ParseException e) {
				System.out.println(datum + " ist ein ungültiges Datumsformat");
			}
			
			double summe = random.nextInt(10) ;
			String hotelname = "HF";
			int reisedauer = random.nextInt(10);
			Reservierung reservierung = new Hotelreservierung(reservierungsnummer, datum, summe, hotelname, reisedauer);
			reservierungsListe[i]=reservierung;
		}
		for (int i = anzahl; i < 2*anzahl; i++) {
			String reservierungsnummer = "F"+ random.nextInt(1000)+2000;
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			
			Date datum = null;
			try {
				datum = dateFormat.parse("20-11-2019");
			} catch (ParseException e) {
				System.out.println(datum + " ist ein ungültiges Datumsformat");
			}
			String[] randomPlaces = {"BER","NY","HKG","JP", "IST"};
			double summe = random.nextInt(10) ;
			String abflughafen =randomPlaces[random.nextInt(randomPlaces.length)];
			String zielflughafen=randomPlaces[random.nextInt(randomPlaces.length)];
			String flugnummer= abflughafen+""+ random.nextInt(1000)+1000;
			Reservierung reservierung = new Flugreservierung(reservierungsnummer, datum, summe, abflughafen, zielflughafen, flugnummer);
			reservierungsListe[i]=reservierung;
		}
		return reservierungsListe;
	}
}
