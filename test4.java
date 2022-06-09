import java.util.Scanner;

public class test4 {
  public static void main(String[] args) {
    Scanner usuario = new Scanner(System.in);
    System.out.print("Ingrese el numero del dia de la semana: ");
    int day = usuario.nextInt();

    if (day == 1) {
      System.out.println("Feliz lunes!");
    } else if (day == 2) {
      System.out.print("Feliz Martes!");
    } else if (day == 3) {
      System.out.print("Feliz Miercoles!");
    } else if (day == 4) {
      System.out.print("Feliz jueves!");
    } else if (day == 5) {
      System.out.print("Feliz viernes!");
    } else if (day == 6) {
      System.out.print("Feliz sabado!");
    } else if (day == 7) {
      System.out.print("Feliz Domingo!");
    } else if (day >= 8) {
      System.out.println("El numero es invalido!");
      System.out.println("Recuerda que la semana solo tiene 7 dias...");
    }

  }

}
