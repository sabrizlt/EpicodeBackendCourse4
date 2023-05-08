package Esercizio2;

import java.util.Scanner;

public class calcolaChilometri {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il numero di km percorsi: ");
        double kmPercorsi = input.nextDouble();

        System.out.print("Inserisci il numero di litri di carburante consumati: ");
        double litriConsumati = input.nextDouble();

        try {
            if (litriConsumati == 0) {
                throw new Exception("Errore: Calcolo impossibile.");
            }
            double kmPerLitro = kmPercorsi / litriConsumati;
            System.out.println("Il numero di km/litro percorsi è: " + kmPerLitro);
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }

        input.close();
    }
}