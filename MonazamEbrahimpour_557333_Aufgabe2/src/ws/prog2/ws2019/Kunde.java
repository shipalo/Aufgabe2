/**
 * 
 */
package ws.prog2.ws2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * @author shiva Monazam Ebrahimpour MatrikelNummer:557333
 * @version Eclips 2018-12 (4.10.0)
 * @since jdkversion jdk-11.0.2 Erstellungsdatum:16.11.2019
 *
 * 
 */
public abstract class Kunde {

	private int kundennummer;              
	private String vorname;			
	private String nachname;
	private String anrede;
	private Date geburtsdatum;
	private String email;
	private String telNummer;
	private Address adresse;

	private ArrayList<Reservierung> reservierungsListe;

	/**
	 * Der Konstruktor mit den Variablen die initialisiert werden.
	 * 
	 * @param kundennummer      Die Kundennummer der Kunde. 
	 * @param vorname			Der Vorname der Kunde.
	 * @param nachname			Der Naname der Kunde
	 * @param anrede			Die Anrede (Frau,Herr, D) der Kunde
	 * @param geburtsdatum		Das Geburtsdatum der Kunde
	 * @param email				Die Emailaddresse der Kunde
	 * @param telNummer			Die Telefonnummer der Kunde
	 * @param adresse			Die Addresse der Kunde
	 */
	public Kunde(int kundennummer, String vorname, String nachname, String anrede, Date geburtsdatum, String email,
			String telNummer, Address adresse) {
		this.kundennummer = kundennummer;
		this.vorname = vorname;
		this.nachname = nachname;
		this.anrede = anrede;
		this.geburtsdatum = geburtsdatum;
		this.email = email;
		this.telNummer = telNummer;
		this.adresse = adresse;

		this.reservierungsListe = new ArrayList<Reservierung>();
	}

	/**
	 * Die Methode liefert im Fall des Privatkunden die Kombination von Vor- und
	 * Nachnamen und im Fall des Geschäftskunden die Kombination von Vor-,
	 * Nachnamen und Firmennamen.
	 * 
	 * @return name der vollständinge Name
	 */
	public String getName() {
		String name = getVorname() + " " + getNachname();

		if (this instanceof Geschaeftskunde) {
			Geschaeftskunde geschaeftskunde = (Geschaeftskunde) this;
			name = name + " - " + geschaeftskunde.getFirmennamen();
		}
		return name;
	}

	// -------------------
	// GETTER UND SETTER
	// -------------------

	/**
	 * Die Methode gibt den Wert der Variable kundennummer zurück.
	 * 
	 * @return der Wert der Variable kundennummer
	 */
	public int getKundennummer() {
		return kundennummer;
	}

	/**
	 * Der Wert der Variable kundennummer wird durch den Wert des Parameters
	 * überschrieben
	 * 
	 * @param kundennummer neuer Wert überschreibt kundennummer
	 */
	public void setKundennummer(int kundennummer) {
		this.kundennummer = kundennummer;
	}

	/**
	 * Die Methode gibt den Wert der Variable vorname zurück.
	 * 
	 * @return der Wert der Variable vorname
	 */
	public String getVorname() {
		return vorname;
	}

	/**
	 * Der Wert der Variable vorname wird durch den Wert des Parameters
	 * überschrieben
	 * 
	 * @param vorname neuer Wert überschreibt vorname
	 */
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	/**
	 * Die Methode gibt den Wert der Variable nachname zurück.
	 * 
	 * @return der Wert der Variable nachname
	 */
	public String getNachname() {
		return nachname;
	}

	/**
	 * Der Wert der Variable nachname wird durch den Wert des Parameters
	 * überschrieben
	 * 
	 * @param nachname neuer Wert überschreibt nachname
	 */
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	/**
	 * Die Methode gibt den Wert der Variable anrede zurück.
	 * 
	 * @return der Wert der Variable anrede
	 */
	public String getAnrede() {
		return anrede;
	}

	/**
	 * Der Wert der Variable anrede wird durch den Wert des Parameters überschrieben
	 * 
	 * @param anrede neuer Wert überschreibt anrede
	 */
	public void setAnrede(String anrede) {
		this.anrede = anrede;
	}

	/**
	 * Die Methode gibt den Wert der Variable geburtsdatum zurück.
	 * 
	 * @return der Wert der Variable geburtsdatum
	 */
	public Date getGeburtsdatum() {
		return geburtsdatum;
	}

	/**
	 * Der Wert der Variable geburtsdatum wird durch den Wert des Parameters
	 * überschrieben
	 * 
	 * @param geburtsdatum neuer Wert überschreibt geburtsdatum
	 */
	public void setGeburtsdatum(Date geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	/**
	 * Die Methode gibt den Wert der Variable email zurück.
	 * 
	 * @return der Wert der Variable email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Der Wert der Variable email wird durch den Wert des Parameters überschrieben
	 * 
	 * @param email neuer Wert überschreibt email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Die Methode gibt den Wert der Variable telNummer zurück.
	 * 
	 * @return der Wert der Variable telNummer
	 */
	public String getTelNummer() {
		return telNummer;
	}

	/**
	 * Der Wert der Variable telNummer wird durch den Wert des Parameters
	 * überschrieben
	 * 
	 * @param telNummer neuer Wert überschreibt telNummer
	 */
	public void setTelNummer(String telNummer) {
		this.telNummer = telNummer;
	}

	/**
	 * Die Methode gibt den Wert der Variable privateAdresse zurück.
	 * 
	 * @return der Wert der Variable privateAdresse
	 */
	public Address getPrivateAdresse() {
		return adresse;
	}

	/**
	 * Der Wert der Variable privateAdresse wird durch den Wert des Parameters
	 * überschrieben
	 * 
	 * @param privateAdresse neuer Wert überschreibt privateAdresse
	 */
	public void setPrivateAdresse(Address privateAdresse) {
		if (privateAdresse != null) {

			this.adresse = privateAdresse;
		}
	}


	/**
	 * Die Methode gibt den Wert der Variable reservierungsListe zurück.
	 * 
	 * @return der Wert der Variable reservierungsListe
	 */
	public ArrayList<Reservierung> getReservierungsListe() {
		return reservierungsListe;
	}

	/**
	 * Der Wert der Variable reservierungsListe wird durch den Wert des Parameters
	 * überschrieben
	 * 
	 * @param kundenListe neuer Wert überschreibt reservierungsListe
	 */
	public void setReservierungsListeListe(ArrayList<Reservierung> reservierungsListe) {
		this.reservierungsListe = reservierungsListe;
	}

	public boolean addReservierung(Reservierung reservierung) {
		if (reservierung != null) {
			reservierungsListe.add(reservierung);
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Kunde [kundennummer=" + kundennummer + ", vorname=" + vorname + ", nachname=" + nachname + ", anrede="
				+ anrede + ", geburtsdatum=" + geburtsdatum + ", email=" + email + ", telNummer=" + telNummer
				+ ", privateAdresse=" + adresse + "]";
	}
}