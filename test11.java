import java.util.Scanner;;

public class test11 {
  public static void main(String[] args) {

    int i = 0;
    int j = 0;

    /**
     * !Creo dos variables de entrada de datos
     */
    System.out.println("Rectangulo. ");

    System.out.println("Escribe el alto del rectángulo:");
    String entrada = "";
    Scanner escaner = new Scanner(System.in);
    entrada = escaner.nextLine();
    int numEntero = Integer.parseInt(entrada);

    System.out.println("Ahora escribe el ancho del rectángulo:");
    String entrada2 = "";
    Scanner escaner2 = new Scanner(System.in);
    entrada2 = escaner2.nextLine();
    int numEntero2 = Integer.parseInt(entrada2);

    /**
     * ! Creo un ciclo anidado con
     * * Hago un incremento de las variable I y J para las columnas y filas
     */

    while (i < numEntero) {
      while (j < numEntero2) {
        System.out.print("+");
        j++;
      }
      System.out.println();
      j = 0;
      i++;
    }
  }
}
