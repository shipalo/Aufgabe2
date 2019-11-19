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
public class Zahlungsmethode {
	private String bezeichnung;
	private String beschreibung;

	/**
	 * Der Konstruktor mit den Variablen die initialisiert werden.
	 * 
	 * @param bezeichnung
	 * @param beschreibung
	 */
	public Zahlungsmethode(String bezeichnung, String beschreibung) {
		this.bezeichnung = bezeichnung;
		this.beschreibung = beschreibung;
	}

	// ------------------
	// GETTER UND SETTER
	// ------------------
	/**
	 * Die Methode gibt den Wert der Variable bezeichnung zurück.
	 * 
	 * @return der Wert der Variable bezeichnung
	 */
	public String getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * Der Wert der Variable bezeichnung wird durch den Wert des Parameters
	 * überschrieben
	 * 
	 * @param bezeichnung neuer Wert überschreibt bezeichnung
	 */
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	/**
	 * Die Methode gibt den Wert der Variable beschreibung zurück.
	 * 
	 * @return der Wert der Variable beschreibung
	 */
	public String getBeschreibung() {
		return beschreibung;
	}

	/**
	 * Der Wert der Variable beschreibung wird durch den Wert des Parameters
	 * überschrieben
	 * 
	 * @param beschreibung neuer Wert überschreibt beschreibung
	 */
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Zahlungsmethode [bezeichnung=" + bezeichnung + ", beschreibung=" + beschreibung + "]";
	}
	
	
}
