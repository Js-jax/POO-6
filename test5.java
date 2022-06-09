import java.util.Scanner;

public class test5 {
  public static void main(String[] args) {
    Scanner usuario = new Scanner(System.in);
    System.out.println("Ingrese el numero del dia");
    int day = usuario.nextInt();
    switch (day) {
      case 1:
        System.out.println("Feliz lunes!");
        break;
      case 2:
        System.out.println("Feliz martes!");
        break;
      case 3:
        System.out.println("Feliz miercoles!");
        break;
      case 4:
        System.out.println("Feliz jueves!");
        break;
      case 5:
        System.out.println("Feliz viernes!");
        break;
      case 6:
        System.out.println("Feliz sabado!");
        break;
      case 7:
        System.out.println("Feliz domingo!");
        break;
    }

    if (day >= 8) {
      System.out.println("El numero es invalido: ");
      System.out.println("Recuerda que la semana solo tiene 7 dias...");
    }
  }

}
