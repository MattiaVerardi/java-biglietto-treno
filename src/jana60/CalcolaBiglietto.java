package jana60;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {

/*Il programma dovr‡ chiedere allíutente il numero di chilometri che vuole percorrere e líet‡ del passeggero. 
 * Sulla base di queste informazioni dovr‡ calcolare il prezzo totale del viaggio, secondo queste regole:
 *   il prezzo del biglietto Ë definito in base ai km (0.21 Ä al km)
 *   va applicato uno sconto del 20% per i minorenni
 *   va applicato uno sconto del 40% per gli over 65
*/
		
		// dati utente
		float numeroKm;
		int et‡Passeggero;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Inserisci i km da percorrere: ");
		numeroKm = scan.nextInt();
		System.out.print("Inserisci l'et‡ del passeggero: ");
		et‡Passeggero= scan.nextInt();
		
		System.out.println("Km da percorrere: " + numeroKm + " km");
		System.out.println("Et‡ del passeggero: " + et‡Passeggero + " anni");
		
		//calcolatore biglietto
		double prezzoAlKm = 0.21;
		double prezzoBiglietto = prezzoAlKm * numeroKm;
		double prezzoBigliettoMinorenni = prezzoBiglietto * 80/100;
		double prezzoBigliettoAnziani = prezzoBiglietto * 60/100;
		
		if (et‡Passeggero > 0) {
			if (et‡Passeggero < 18) {
				System.out.println("Importo da pagare: " + prezzoBigliettoMinorenni + " euro");
			} else if (et‡Passeggero >= 65) {
				System.out.println("Importo da pagare: " + prezzoBigliettoAnziani + " euro");
			} else {
				System.out.println("Importo da pagare: " + prezzoBiglietto + " euro");
			}
		} else {
			System.out.println("Il valore et‡ inserito non Ë corretto");
		}
		
	}

}
