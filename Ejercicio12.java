import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        double hour, salary, gross_salary, net_salary, retent, source_retent;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese horas de trabajo:");
        hour = input.nextDouble();
        System.out.println("Ingrese salario:");
        salary = input.nextDouble();
        retent = 0.125;

        gross_salary = hour * salary;
        source_retent = gross_salary * retent;
        net_salary = gross_salary - source_retent;

        System.out.println("El salario bruto es " + gross_salary);
        System.out.println("La retencion en la fuente es " + source_retent);
        System.out.println("El salario neto del trabajador es " + net_salary);

    }
}