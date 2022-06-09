import java.util.*;

public class test12 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Cuadrado: ");
    System.out.println("Ingresa el valor: ");

    int valor = sc.nextInt();

    /*
     * Se utiliza los bloques anidados para poder crear el cuadrado
     * 
     * El primer bucle creara las filas
     * El segundo bloque las columnas
     */

    for (int fila = 1; fila <= valor; fila++) {
      for (int columna = 1; columna <= valor; columna++) {
        System.out.print(" # ");

      }
      System.out.println();
    }
  }
}
