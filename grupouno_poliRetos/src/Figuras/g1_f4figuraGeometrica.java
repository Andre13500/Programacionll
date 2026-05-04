package src.Figuras;

public class g1_f4figuraGeometrica extends controllerFigura {

public void g1_f4figuraGeometrica_FOR() {
    int n = getScanner("F4: Figura Geometrica", "FOR");
       
    
    
      for (int i = 0; i < n; i++) {
            // 1. Imprimir espacios (cada vez menos)
            for (int j = 0; j < n - i; j++) {
                System.out.print("  "); 
            }

            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }

            // 3. Salto de línea
            System.out.println();
        }




    System.out.println("\n----------------------------------");

}}
