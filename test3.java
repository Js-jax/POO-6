import java.util.Scanner;

public class test3 {
  public static void main(String[] args) {
    int suma = 0;

    Scanner sc = new Scanner(System.in);

    System.out.println("Debera Ingresar 10 numeros: ");

    for (int i = 0; i < 10; i++) {

      System.out.print("Ingrese un numero: ");

      int valor = sc.nextInt();

      suma += valor;
    }

    System.out.println("La suma de los 10 nuemros es: " + suma);

  }

}
