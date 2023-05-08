package Esercizio1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayNumber {

    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println("Array iniziale: " + Arrays.toString(arr));

        Scanner input = new Scanner(System.in);
        int pos, value = 0;

            try {
                System.out.print("Inserisci la posizione da modificare (0-4): ");
                pos = input.nextInt();
                if (pos < 0 || pos >= arr.length) {
                    throw new ArrayIndexOutOfBoundsException("Errore: Numero non valido");
                }
                System.out.print("Inserisci il nuovo valore (0-10): ");
                value = input.nextInt();
                if (value < 0 || value > 10) {
                    throw new Exception("Errore: Valore non valido");
                }
                arr[pos] = value;
                System.out.println("Nuovo stato dell'array: " + Arrays.toString(arr));
            } catch (Exception  e) {
                System.out.println("Errore: " + e.getMessage());
            }
    }

}
