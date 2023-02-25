import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        int edjuan, edana, edalber, edmama;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        edjuan = input.nextInt();

        edalber = 2 * (edjuan / 3);
        edana = 4* (edjuan / 3);
        edmama = edjuan + edalber + edana;

        System.out.println("La edad de Alberto es: " + edalber);
        System.out.println("La edad de Ana es: " + edana);
        System.out.println("La edad de la madre es: " + edmama);

    }
}