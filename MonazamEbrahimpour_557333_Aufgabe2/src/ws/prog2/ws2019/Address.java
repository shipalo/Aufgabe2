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
public class Address {
	private String strasse; 
	private String hausNr;
	private String plz;
	private String stadt;

	/**
	 * Der Konstruktor mit den Variablen die initialisiert werden.
	 * 
	 * @param strasse Strassennamen
	 * @param hausNr  Hausnummer
	 * @param plz     Die PLZ der Stadt
	 * @param stadt   Die Stadt
	 */
	public Address(String strasse, String hausNr, String plz, String stadt) {
		this.strasse = strasse;
		this.hausNr = hausNr;
		this.plz = plz;
		this.stadt = stadt;
	}

	/**
	 * Die Methode gibt den Wert der Variable strasse zurück.
	 * 
	 * @return der Wert der Variable strasse
	 */
	public String getStrasse() {
		return strasse;
	}

	/**
	 * Der Wert der Variable strasse wird durch den Wert des Parameters
	 * überschrieben
	 * 
	 * @param strasse neuer Wert überschreibt strasse
	 */
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	/**
	 * Die Methode gibt den Wert der Variable hausNr zurück.
	 * 
	 * @return der Wert der Variable hausNr
	 */
	public String getHausNr() {
		return hausNr;
	}

	/**
	 * Der Wert der Variable hausNr wird durch den Wert des Parameters überschrieben
	 * 
	 * @param hausNr neuer Wert überschreibt hausNr
	 */
	public void setHausNr(String hausNr) {
		this.hausNr = hausNr;
	}

	/**
	 * Die Methode gibt den Wert der Variable plz zurück.
	 * 
	 * @return der Wert der Variable plz
	 */
	public String getPlz() {
		return plz;
	}

	/**
	 * Der Wert der Variable plz wird durch den Wert des Parameters überschrieben
	 * 
	 * @param plz neuer Wert überschreibt plz
	 */
	public void setPlz(String plz) {
		this.plz = plz;
	}

	/**
	 * Die Methode gibt den Wert der Variable stadt zurück.
	 * 
	 * @return der Wert der Variable stadt
	 */
	public String getStadt() {
		return stadt;
	}

	/**
	 * Der Wert der Variable stadt wird durch den Wert des Parameters überschrieben
	 * 
	 * @param stadt neuer Wert überschreibt stadt
	 */
	public void setStadt(String stadt) {
		this.stadt = stadt;
	}

	@Override
	public String toString() {
		return "Address [strasse=" + strasse + ", hausNr=" + hausNr + ", plz=" + plz + ", stadt=" + stadt + "]";
	}

}
