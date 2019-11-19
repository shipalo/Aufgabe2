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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MenuSteuerung {

	private Scanner scanner = new Scanner(System.in); // von der Tastatur einlesen

	private ArrayList<Kunde> alleKunden = new ArrayList<Kunde>();
	private ArrayList<Reservierung> alleReservierungen = new ArrayList<Reservierung>();

	private boolean programmbeenden = false; // Programm wird beendet wenn es true ist

	/**
	 * 
	 * Der Konstruktor mit den Variablen die initialisiert werden.
	 */
	public MenuSteuerung() {

	}

	/**
	 * Fügt Kunden und Reservierungsdaten zu den ArrayLists hinzu.
	 * 
	 * @param kunden         das Kundenarray,
	 * @param reservierungen das Reservierungsarray.
	 */
	public void addTestDaten(Kunde[] kunden, Reservierung[] reservierungen) {
		for (Kunde kunde : kunden) {
			alleKunden.add(kunde);
		}
		for (Reservierung reservierung : reservierungen) {
			alleReservierungen.add(reservierung);
		}
	}

	/**
	 * Zeigt das Menu auf der Konsole
	 * 
	 */
	public void showMenu() {
		System.out.println();
		String menu = //
				"(01) Privatkunde anlegen\n"//
						+ "(02) Geschäftskunde anlegen\n"//
						+ "(03) Reservierung anlegen und Kundennummer zuordnen\n"//
						+ "(04) Kunde mit Reservierungen anzeigen (Auswahl durch Kundennummer) \n"//
						+ "(05) Kunde mit Reservierungen anzeigen (Auswahl durch Name)\n"//
						+ "(06) Reservierung anzeigen (Auswahl durch Reservierungsnummer)\n"//
						+ "(07) Beenden";

		System.out.println(menu);
	}

	/**
	 * Steuert die einzelnen Menupunkte.
	 */
	public void menusteuerung() {
		System.out.println();
		System.out.println("Wählen Sie ein Menüpunkt aus!");
		int choice = scanner.nextInt(); // menuwahl
		Kunde kunde = null;
		switch (choice) {
		case 1: // privatkunden erstellen
			kunde = generateKunde("privatkunde");
			alleKunden.add(kunde);
			System.out.println("Privatkunde erfolgreich erstellt");
			showMenu();
			break;

		case 2: // geschäftskunden erstellen
			kunde = generateKunde("geschäftskunde");
			alleKunden.add(kunde);
			System.out.println("Geschäftskunde erfolgreich erstellt");
			showMenu();
			break;

		case 3:
			Reservierung reservierung = generateReservierung();
			alleReservierungen.add(reservierung);

			System.out.println("Ausgabe aller Kunden mit Kundennummer!");
			printList(alleKunden);

			System.out.println();
			System.out.println(
					"Ordnen Sie die Reservierung der Kundennummer zu!\n" + "Wählen Sie nun die Kundennummer aus!");
			int kundennummer = scanner.nextInt();

			boolean existKunde = existKunde(kundennummer);
			while (existKunde == false) {
				System.out.println("ERROR: Die eingebene Kundennummer existiert nicht.");

				System.out.println();
				System.out.println("Wählen Sie nun die Kundennummer aus!");
				kundennummer = scanner.nextInt();
				existKunde = existKunde(kundennummer);
			}
			setReservierungToKunde(kundennummer, reservierung);
			System.out.println("Reservierung: " + reservierung + " erfolgreich zu der Kundennummer: " + kundennummer
					+ " zugeordnet.");

			showMenu();
			break;

		case 4:
			System.out.println("Geben Sie die Kundennummer des Kunden ein!");
			int nummer = scanner.nextInt();
			existKunde = existKunde(nummer);
			while (existKunde == false) {
				System.out.println("ERROR: Die eingebene Kundennummer ist falsch!");
				System.out.println("Bitte geben Sie die Kundennummer ein!");
				nummer = scanner.nextInt();
				existKunde = existKunde(nummer);
			}
			showReservierungByKundennummer(nummer);
			showMenu();
			break;

		case 5:
			System.out.println("Geben Sie den Kundennamen für das Anzeigen der Reservierung ein!");
			scanner.nextLine();
			String name = scanner.nextLine();
			showReservierungByKundenname(name);
			showMenu();
			break;

		case 6:
			System.out.println("Geben Sie die Reservierungsnummer zum Anzeigen der Reservierungen ein!");
			System.out.println("Reservierungsnummer: ");
			for (Reservierung res : alleReservierungen) {
				System.out.println("\t" + res.getReservierungsnummer());
			}
			String reservierungsnummer = scanner.next();
			boolean existReservierung = existReservierung(reservierungsnummer);
			while (existReservierung == false) {
				System.out.println("ERROR: Die Reservierungsnummer ist falsch!");
				System.out.println("Geben Sie die Reservierungsnummer erneut ein!");
				reservierungsnummer = scanner.next();
				existReservierung = existReservierung(reservierungsnummer);

			}
			printReservierungByNummer(reservierungsnummer);
			showMenu();
			break;
		case 7:

			programmbeenden = true;
			break;

		default:
			break;
		}

	}

	/**
	 * Gibt die gesuchte Reservierung auf der Konsole aus.
	 * 
	 * @param reservierungsnummer die gesuchte Reservierung
	 */
	private void printReservierungByNummer(String reservierungsnummer) {
		for (Reservierung reservierung : alleReservierungen) {
			if (reservierung.getReservierungsnummer().equalsIgnoreCase(reservierungsnummer)) {
				System.out.println("Gesuchte Reservierung:");
				if (reservierung instanceof Hotelreservierung) {
					System.out.println(((Hotelreservierung) reservierung).toString());

				} else {
					System.out.println(((Flugreservierung) reservierung).toString());
				}
			}
		}
	}

	/**
	 * Überprüft ob die Reservierung existiert!
	 * 
	 * @param reservierungsnummer die Reservierung wonach es überprüft wird
	 * @return true Wenn die Reservierung vorhanden ist und sonst false
	 */
	private boolean existReservierung(String reservierungsnummer) {
		for (Reservierung reservierung : alleReservierungen) {
			if (reservierung.getReservierungsnummer().equalsIgnoreCase(reservierungsnummer)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Zeigt auf der Konsole den Kunden mit seinen Reservierungen an.
	 * 
	 * @param name der Name des Kunden.
	 */
	private void showReservierungByKundenname(String name) {

		for (Kunde kunde : alleKunden) {
			if (kunde.getName().equalsIgnoreCase(name)) {
				System.out.println("Kunde: " + kunde.getName());
				ArrayList<Reservierung> reservierungsListe = kunde.getReservierungsListe();
				if (reservierungsListe.isEmpty()) {
					System.out.println("Keine Reservierung für diesen Kunden");
				} else {
					printReservierung(reservierungsListe);
				}
			}
		}
	}

	/**
	 * @param kundennummer die Nummer von Kunde wird hier gezeigt
	 */
	private void showReservierungByKundennummer(int kundennummer) {
		for (Kunde kunde : alleKunden) {
			if (kunde.getKundennummer() == kundennummer) {
				System.out.println("Kunde: " + kunde.getName());
				ArrayList<Reservierung> reservierungsListe = kunde.getReservierungsListe();
				printReservierung(reservierungsListe);
			}
		}

	}

	private void printReservierung(ArrayList<Reservierung> reservierungsListe) {
		for (Reservierung reservierung : reservierungsListe) {
			if (reservierung instanceof Hotelreservierung) {
				System.out.println("\t" + ((Hotelreservierung) reservierung).toString());
			} else if (reservierung instanceof Flugreservierung) {
				System.out.println("\t" + ((Flugreservierung) reservierung).toString());
			}
		}
	}

	/**
	 * @param alleKunden
	 */
	private void printList(ArrayList<Kunde> alleKunden) {
		for (Kunde kunde : alleKunden) {
			System.out.println("Kunde: " + kunde.getName() + " Kundennummer: " + kunde.getKundennummer());
		}
	}

	public boolean existKunde(int kundennummer) {
		boolean findKunde = false;
		for (Kunde kunde : alleKunden) {
			if (kunde.getKundennummer() == kundennummer) {
				findKunde = true;
			}
		}
		return findKunde;
	}

	public boolean setReservierungToKunde(int kundennummer, Reservierung reservierung) {
		for (Kunde kunde : alleKunden) {
			if (kunde.getKundennummer() == kundennummer) {
				kunde.addReservierung(reservierung);
				return true;
			}
		}
		return false;
	}

	/**
	 * Die Methode generiert Reservierungen (Hotel- und Flugreservierung). Der
	 * Nutzer muss 1 für Hotel- und 2 für Flugreservierung eingeben, damit die
	 * jeweilige Reservierung erstellt werden kann.
	 * 
	 * @return die erstellte Reservierung
	 */
	private Reservierung generateReservierung() {
		System.out.println("Reservierung anlegen");
		System.out.println("Möchten Sie eine Hotelreservierung oder Flugreservierung anlegen? ");
		System.out.println("1= Hotelreservierung und 2 = Flugreservierung");
		int choice = scanner.nextInt();
		while (choice != 1 && choice != 2) {
			System.out.println("ERROR: Bitte 1 = Hotelreservierung und 2 = Flugreservierung eingeben");
			choice = scanner.nextInt();
		}
		System.out.println("Geben Sie die Reservierungsnummer ein");
		String reservierungsnummer = scanner.next();

		Date datum = generateDate();

		System.out.println("Geben Sie die Summe (Anzahl der Personen ?) ein!");
		double summe = scanner.nextDouble();
		if (choice == 1) { // Hotelreservierung
			System.out.println("Geben Sie den Hotelnamen ein");
			String hotelname = scanner.next();
			System.out.println("Geben Sie die Reisedauer als Zahl ein");
			int reisedauer = scanner.nextInt();
			Hotelreservierung hotelreservierung = new Hotelreservierung(reservierungsnummer, datum, summe, hotelname,
					reisedauer);
			return hotelreservierung;
		} else { // Flugreservierung
			System.out.println("Geben Sie den  Abflughafen ein");
			String abflughafen = scanner.next();
			System.out.println("Geben Sie  den Zielhafen ein");
			String zielflughafen = scanner.next();
			System.out.println("Geben Sie die Flugnummer ein");
			String flugnummer = scanner.next();
			Flugreservierung flugreservierung = new Flugreservierung(reservierungsnummer, datum, summe, abflughafen,
					zielflughafen, flugnummer);
			return flugreservierung;
		}
	}

	/**
	 * Erstellt im Allgemeinen Kunden (Privat- oder Geschäftskunden).
	 * 
	 * @param kunde dient als Verzweigung: privat oder geschäftskunden
	 * @return der Kunde;
	 */
	private Kunde generateKunde(String kunde) {

		System.out.println("Geben Sie die Kundennummer ein");
		int kundennummer = scanner.nextInt();

		System.out.println("Geben Sie den Vornamen ein");
		String vorname = scanner.next();

		System.out.println("Geben Sie den Nachnamen ein");
		String nachname = scanner.next();

		System.out.println("Geben Sie die Anrede ein (Herr, Frau, D)");
		String anrede = scanner.next();
		while (!anrede.equalsIgnoreCase("Herr") && !anrede.equalsIgnoreCase("Frau") && !anrede.equalsIgnoreCase("D")
				&& !anrede.equalsIgnoreCase("X")) {
			System.out.println("Bitte geben Sie die Anrede ein: Herr, Frau oder D");
			anrede = scanner.next();
		}

		Date geburtsdatum = generateDate();

		System.out.println("Geben Sie bitte die E-Mail-Adresse ein");
		String email = scanner.next();

		System.out.println("Geben Sie bitte die Telefonnummer ein");
		String telNummer = scanner.next();

		Address privateAdresse = generateAdresse();

		if (kunde.equalsIgnoreCase("privatkunde")) { // ignoreCase -> ignoriere Groß-Kleinschreibung
			System.out.println("Geben Sie nun die Anzahl an Zahlungsmehtoden ein. 1,2 oder 3 !");
			int count = scanner.nextInt();

			Zahlungsmethode[] zahlungsmethoden = generateZahlungsmethoden(count);
			Privatkunde privatkunde = new Privatkunde(kundennummer, vorname, nachname, anrede, geburtsdatum, email,
					telNummer, privateAdresse, zahlungsmethoden);
			return privatkunde;
		}
		if (kunde.equalsIgnoreCase("geschäftskunde")) { // ignoreCase -> ignoriere Groß-Kleinschreibung
			System.out.println("Geben Sie den Firmennamen ein");
			scanner.nextLine();
			String firmenname = scanner.nextLine();
			System.out.println("Kommunikationsweg für die Rechnung:");
			System.out.println("Soll die Rechnung per Post versendet werden? Ja = Post, Nein = E-mail");
			String beschreibung = scanner.next();
			while (!beschreibung.equalsIgnoreCase("Ja") && !beschreibung.equalsIgnoreCase("Nein")) {
				System.out.println("ERROR: Bitte geben Sie 'Ja' oder 'Nein' ein.");
				System.out.println("Soll die Rechnung per Post versendet werden? Ja = Post, Nein = E-mail");
				beschreibung = scanner.next();
			}
			boolean post = beschreibung.equalsIgnoreCase("Ja");
			Geschaeftskunde geschaeftskunde = new Geschaeftskunde(kundennummer, vorname, nachname, anrede, geburtsdatum,
					email, telNummer, privateAdresse, firmenname, post);
			return geschaeftskunde;
		}
		return null;
	}

	/**
	 * Erstellt ein Array von Zahlungsmethoden, wobei bei jeder Zahlungsmethode die
	 * Bezeichnung und Beschreibung von der Tastatur eingelesen wird.
	 * 
	 * @param count Die Anzahl der zu erstellenden Zahlungsmethoden
	 * @return ein Array der Zahlungsmehtoden
	 */
	private Zahlungsmethode[] generateZahlungsmethoden(int count) {
		Zahlungsmethode[] zahlungsmethodenArray = new Zahlungsmethode[count];
		int curretnIndex = 0;

		while (curretnIndex < count) {
			System.out.println("Geben Sie die Bezeichnung für die " + (curretnIndex + 1) + ". Zahlungsmethode ein!");
			String bezeichnung = scanner.next();
			System.out.println("Geben Sie die Beschreibung für die " + (curretnIndex + 1) + ". Zahlungsmethode ein!");
			String beschreibung = scanner.next();
			Zahlungsmethode zahlungsmethode = new Zahlungsmethode(bezeichnung, beschreibung);

			zahlungsmethodenArray[curretnIndex] = zahlungsmethode;
			curretnIndex++;
		}
		return null;
	}

	/**
	 * Generriert eine Adresse die über die Tastatur eingelesen wird.
	 * 
	 * @return adresse die Adresse
	 */
	private Address generateAdresse() {
		System.out.println("Geben Sie die Strasse ein");
		String strasse = scanner.next();
		System.out.println("Geben Sie die Hausnummer ein");
		String hausNr = scanner.next();
		System.out.println("Geben Sie die PLZ ein");
		String plz = scanner.next();
		System.out.println("Geben Sie die Stadt ein");
		String stadt = scanner.next();
		Address address = new Address(strasse, hausNr, plz, stadt);
		return address;
	}

	/**
	 * Erstellt ein Datum nach dem Format: dd-MM-yyyy. Auf der Webseite:
	 * https://beginnersbook.com/2013/05/java-date-format-validation/ wurde ein Teil
	 * der Validierung übernommen.
	 * 
	 * @return gültiges Datum im Format: dd-MM-yyyy
	 */
	private Date generateDate() {
		// https://beginnersbook.com/2013/05/java-date-format-validation/

		System.out.println("Geben Sie das Datum ein! Bitte Format beachten: dd-MM-yyyy");
		String date = scanner.next();

		while (!date.matches("\\d{2}-\\d{2}-\\d{4}")) {
			System.out.println(date + " ist ein ungültiges Datumsformat!");
			
			System.out.println("Geben Sie das Datum ein! Bitte Format beachten: dd-MM-yyyy");
			date = scanner.next();
		}

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		dateFormat.setLenient(false);
		Date birthday = null;
		try {
			birthday = dateFormat.parse(date);
		} catch (ParseException e) {
			System.out.println(date + " ist ein ungültiges Datumsformat");
		}

		return birthday;
	}

	/**
	 * Getter für die Variable programmbeenden
	 * 
	 * @return programmbeenden
	 */
	public boolean getProgrammbeenden() {
		return programmbeenden;
	}

}
