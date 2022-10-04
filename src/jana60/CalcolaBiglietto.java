package jana60;

import java.text.DecimalFormat;
import java.util.Scanner;

//Il programma dovrà chiedere all’utente il numero di chilometri che vuole percorrere e l’età del passeggero. 
//Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio, secondo queste regole:
//il prezzo del biglietto è definito in base ai km (0.21 € al km)
//va applicato uno sconto del 20% per i minorenni
//va applicato uno sconto del 40% per gli over 65

public class CalcolaBiglietto {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("'€' 0.00");

		int numeroKm;
		int etaPasseggero;
		double prezzoKm = 0.21;

		System.out.println("Buongiorno. Inserire i dati richiesti");
		System.out.print("Km da percorrere: ");
		numeroKm = scan.nextInt();
		System.out.print("Età del passeggero: ");
		etaPasseggero = scan.nextInt();

		double prezzoFinale;
		double scontoMinorenni = 0.80;
		double scontoOver = 0.60;
		double prezzoBiglietto = prezzoKm * numeroKm;

		if (etaPasseggero < 18) {
			prezzoFinale = prezzoBiglietto * scontoMinorenni;
		} else if (etaPasseggero > 65) {
			prezzoFinale = prezzoBiglietto * scontoOver;
		} else {
			prezzoFinale = prezzoBiglietto;
		}

		System.out.println("Il costo del biglietto è di " + df.format(prezzoFinale));

		scan.close();

	}

}
