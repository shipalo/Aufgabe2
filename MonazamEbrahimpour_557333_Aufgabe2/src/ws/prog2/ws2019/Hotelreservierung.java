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

public class Hotelreservierung extends Reservierung{

	// Eine Hotelreservierung hat Hotelname und Reisedauer.
	
	private String hotelname;

	private int reisedauer;
	
	/**
	 * @param reservierungsnummer       Die reservierungsnummer des Hotels
	 * @param datum						Das Datum der Reservierung des Hotels				
	 * @param summe						Die summe der Anzahl der Reservierte Naechte
	 * Der Konstruktor mit den Variablen die initialisiert werden.
	 */
	public Hotelreservierung(String reservierungsnummer, Date datum, double summe, String hotelname, int reisedauer) {
		super(reservierungsnummer, datum, summe);
		this.hotelname = hotelname;
		this.reisedauer = reisedauer;
	}
	
	/** 
	 * Die Methode gibt den Wert der Variable hotelname zurück.
	 * @return der Wert der Variable hotelname
	 */
	public String getHotelname() {
		return hotelname;
	}

	/** 
	 * Der Wert der Variable hotelname wird durch den Wert des Parameters überschrieben
	 * @param hotelname neuer Wert überschreibt hotelname 
	 */
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}

	/** 
	 * Die Methode gibt den Wert der Variable reisedauer zurück.
	 * @return der Wert der Variable reisedauer
	 */
	public int getReisedauer() {
		return reisedauer;
	}

	/** 
	 * Der Wert der Variable reisedauer wird durch den Wert des Parameters überschrieben
	 * @param reisedauer neuer Wert überschreibt reisedauer 
	 */
	public void setReisedauer(int reisedauer) {
		this.reisedauer = reisedauer;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Hotelreservierung: "+super.toString()+ " hotelname=" + hotelname + ", reisedauer=" + reisedauer;
	}

}
