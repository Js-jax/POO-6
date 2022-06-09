import java.util.Scanner;

public class test6 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int i = 0, numero = 0, positivos = 0, negativos = 0, suma = 0;

    System.out.println("Ingresa 10 numeros: ");

    do {

      System.out.print("Ingresa los numeros: ");
      numero = sc.nextInt();

      i++;

      suma += numero;

      if (numero > 0) {
        positivos++;
      } else {
        negativos++;
      }
    } while (i < 10);

    System.out.println("Numeros positivos: " + positivos);
    System.out.println("Numeros negativos: " + negativos);
    System.out.println("\nLa suma de los 10 numeros es: " + suma);

  }
}