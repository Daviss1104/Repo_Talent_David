import java.util.Scanner;

public class ejercicio_dos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            long factorial = calcularFactorial(numero);
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        scanner.close();
    }

    public static long calcularFactorial(int n) {
        if (n == 0 || n == 1) {

            return 1;
        } else {
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
} 


