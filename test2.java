import java.util.Scanner;

public class test2 {
  public static void main(String[] args) {

    int i = 0;

    int suma = 0;

    Scanner sc = new Scanner(System.in);

    System.out.println("Ingresa 10 numeros: ");

    do {
      System.out.print("Ingrese un numero: ");

      int valor = sc.nextInt();
      i++;
      suma += valor;
    } while (i < 10);

    System.out.print("La suma de los 10 numeros es: " + suma);
  }
}
