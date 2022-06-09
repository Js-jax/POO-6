import java.util.Scanner;

public class test10 {

  public static void main(String[] args) {
    System.out.println("Temperatura F a C");

    int faht = 10;
    int cels = faht - 32;

    // * Formula de Fahrenheit a Celcius

    cels = cels * 5 / 9;

    System.out.println(faht + "F" + "|" + cels + "C");

    do {

      // !Agrego las variables del inicio para que dentro del ciclo Do While

      faht += 10;
      cels = faht - 32;

      cels = cels * 5 / 9;

      System.out.println(faht + "F" + "|" + cels + "C");
    } while (faht < 150); // ? Agrego el limite de 150

  }
}