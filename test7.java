import java.util.Scanner;

public class test7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero, positivos = 0, negativos = 0, suma = 0;

    System.out.println("Debera Ingresar 10 numeros");

    for (int i = 1; i <= 10; i++) {

      System.out.print("Ingrese un numero: ");

      numero = sc.nextInt();

      suma += numero;

      if (numero > 0) {
        positivos++;
      } else if (numero < 0) {
        negativos++;
      }
    }
    System.out.println("Cantidad de positivos: " + positivos);
    System.out.println("Cantidad de negativos: " + negativos);
    System.out.println("\nLa suma de los 10 numeros es: " + suma);
  }
}