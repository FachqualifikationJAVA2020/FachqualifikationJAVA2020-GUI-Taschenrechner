package actionlistener;

import javax.swing.JTextField;

public class Rechner {
	/*
	 * Schreiben Sie eine Klasse Rechner mit zwei Eingabefeldern
	 * zahl1	+
	 * 			-	ergebnis
	 * zahl2	*
	 * 			/
	 * In der Mitte vier Buttons mit den Rechenoperationen
	 * und rechts ein Ergebnisfeld
	 * Beim Klick auf einen Button soll die Rechenoperation
	 * mit zahl1 und zahl2 durchgeführt und das
	 * ergebnis rechts angezeigt werden
	 * 
	 * Probieren Sie unterschiedliche Implementierungen für
	 * ActionListener!
	 */
	Rechner(){
		JTextField ergebnis = new JTextField();
		ergebnis.setEditable(false);
		/*
		 * Dadurch wird das TextField ausgegraut und nicht mehr
		 * beschreibbar
		 */
	}
}
