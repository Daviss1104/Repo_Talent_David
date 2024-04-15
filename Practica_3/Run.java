// Importa la clase Scanner del paquete java.util, que se utiliza para la entrada de usuario.
import java.util.Scanner;

// Declaración de la clase Run.
public class Run {
    // Método principal, punto de entrada del programa.
    public static void main(String[] args) {
        // Crea un objeto Scanner llamado 'text' para leer cadenas desde la entrada estándar (teclado).
        Scanner text = new Scanner(System.in);
        
        // Crea otro objeto Scanner llamado 'number' para leer números enteros desde la entrada estándar (teclado).
        Scanner number = new Scanner(System.in); // No necesitas crear dos objetos Scanner para la entrada del usuario.

        // Imprime en la consola la solicitud de ingresar el nombre del usuario.
        System.out.println("Ingresa tu nombre: "); // Cambié "printIn" por "println" para imprimir en la consola.
        
        // Lee la línea ingresada por el usuario y la asigna a la variable 'name'.
        String name = text.nextLine(); // Declaración y asignación de valor en una línea.

        // Declaración de una variable entera 'enteroN' inicializada con 0.
        int enteroN = 0;

        // Bloque try-catch para manejar posibles excepciones.
        try {
            // Imprime en la consola la solicitud de ingresar la edad del usuario.
            System.out.println("Ingresa tu edad: "); // También cambié "printIn" por "println" aquí.
            
            // Lee un número entero ingresado por el usuario y lo asigna a la variable 'enteroN'.
            enteroN = number.nextInt();
            
            // Crea un objeto de tipo EdadException.
            EdadException oEdadEx = new EdadException();
            
            // Llama al método 'validarEdad' del objeto 'oEdadEx' para validar la edad ingresada.
            oEdadEx.validarEdad(enteroN);
        } 
        // Captura la excepción EdadException en caso de que ocurra.
        catch (EdadException ex) {
            // Imprime la traza de la excepción en la consola.
            ex.printStackTrace();
            
            // Imprime un mensaje indicando que se ha ingresado al bloque catch.
            System.out.println("Entré al catch"); // Cambiado "printIn" por "println".
            
            // Imprime el mensaje de la excepción en la consola.
            System.out.println(ex.getMessage()); // Cambiado "printIn" por "println".
        } 
        // Bloque finally opcional, se ejecuta siempre después de un try o catch, independientemente de si se lanzó una excepción o no.
        finally {
            // Puedes colocar aquí cualquier código que desees ejecutar, se ejecutará independientemente de si se lanza una excepción o no.
        }
    }
}
