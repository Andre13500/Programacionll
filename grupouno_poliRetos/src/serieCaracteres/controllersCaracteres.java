package src.serieCaracteres;

import java.util.Scanner;

public abstract class controllersCaracteres {
 private Scanner scanner = new Scanner(System.in);
     public int getScanner(String serie, String ciclo) {
        System.out.println("\n--- [G1] " + serie + " - Ciclo: " + ciclo + " ---");
        System.out.print("Ingrese el número de términos: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada no válida. Por favor, ingrese un número entero: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
     

}
