import java.util.Scanner;

public class ejercicio_cuatro {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();

        double resultado = calcularPotencia(base, exponente);
        System.out.println(base + " elevado a la " + exponente + " es igual a " + resultado);

        scanner.close();
    }

    public static double calcularPotencia(double base, int exponente) {
        double resultado = 1;
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }


} 
