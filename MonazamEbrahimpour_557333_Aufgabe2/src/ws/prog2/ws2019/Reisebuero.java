/**
 * 
 */
package ws.prog2.ws2019;

/**
 * @author shiva Monazam Ebrahimpour MatrikelNummer:557333
 * @version Eclips 2018-12 (4.10.0)
 * @since jdkversion jdk-11.0.2 Erstellungsdatum: 17.11.2019
 *
 * 
 */
public class Reisebuero {

	private String name;
	private String steuerIdnr;
	private String email;
	private Address adresse;
	private Kunde kunden[];

	/**
	 * Der Konstruktor mit den Variablen die initialisiert werden.
	 * 
	 * @param name   			Name des Reisebueros
	 * @param steuerIdnr        SteuerNummer(UST-IDNR)des Reisebueros
	 * @param email				Die Email Addresse des Reisebueros
	 * @param adresse			Die Addresse des Reisebueros
	 * @param kunden			Die Kunden des Reisebueros
	 */
	public Reisebuero(String name, String steuerIdnr, String email, Address adresse, Kunde[] kunden) {
		this.name = name;
		this.steuerIdnr = steuerIdnr;
		this.email = email;
		this.adresse = adresse;
		this.kunden = kunden;
	}

	// -----------------
	// GETTER UND SETTER
	// -----------------
	/**
	 * Die Methode gibt den Wert der Variable name zurück.
	 * 
	 * @return der Wert der Variable name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Der Wert der Variable name wird durch den Wert des Parameters überschrieben
	 * 
	 * @param name neuer Wert überschreibt name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Die Methode gibt den Wert der Variable steuerIdnr zurück.
	 * 
	 * @return der Wert der Variable steuerIdnr
	 */
	public String getSteuerIdnr() {
		return steuerIdnr;
	}

	/**
	 * Der Wert der Variable steuerIdnr wird durch den Wert des Parameters
	 * überschrieben
	 * 
	 * @param steuerIdnr neuer Wert überschreibt steuerIdnr
	 */
	public void setSteuerIdnr(String steuerIdnr) {
		this.steuerIdnr = steuerIdnr;
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
	 * Die Methode gibt den Wert der Variable adresse zurück.
	 * 
	 * @return der Wert der Variable adresse
	 */
	public Address getAdresse() {
		return adresse;
	}

	/**
	 * Der Wert der Variable adresse wird durch den Wert des Parameters
	 * überschrieben
	 * 
	 * @param adresse neuer Wert überschreibt adresse
	 */
	public void setAdresse(Address adresse) {
		this.adresse = adresse;
	}

	/**
	 * Die Methode gibt den Wert der Variable kunden zurück.
	 * 
	 * @return der Wert der Variable kunden
	 */
	public Kunde[] getKunden() {
		return kunden;
	}

	/**
	 * Der Wert der Variable kunden wird durch den Wert des Parameters überschrieben
	 * 
	 * @param kunden neuer Wert überschreibt kunden
	 */
	public void setKunden(Kunde[] kunden) {
		this.kunden = kunden;
	}

}
