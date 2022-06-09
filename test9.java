import java.util.Scanner;

public class test9 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Numero Menor");

    // *Ingreso los valores a evaluar

    System.out.print("Ingrese el primer numero: ");
    int numero1 = sc.nextInt();
    System.out.print("Ingrese el segundo numero: ");
    int numero2 = sc.nextInt();

    if (numero1 < numero2) {
      System.out.print("El numero menor es: " + numero1);
    } else if (numero2 < numero1) {
      System.out.print("El numero menor es: " + numero2);
    }

    if (numero1 == numero2) {
      System.out.println("Ambos numeros son iguales");
    }
  }
}
