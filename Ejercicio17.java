import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        double r, a, c;

        System.out.println("Ingrese el radio");
        Scanner input = new Scanner(System.in);
        r = input.nextDouble();
        
        a = Math.PI * Math.pow(r,2);
        c = Math.PI * 2*r;

        System.out.println("El area es: " + a);
        System.out.println("La circunferencia es: " + c);

    }
    
}
