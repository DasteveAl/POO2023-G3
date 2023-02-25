import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        double a, sq, cb;

        System.out.println("Ingrese un numero");
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();

        sq = Math.pow(a, 2);
        cb = Math.pow(a, 3);

        System.out.println("El cuadrado es " + sq);
        System.out.println("El cubo es " + cb);

    }
}