public class EdadException extends Exception {
    public static final long serialVersionUID = 121897812870865L;

    // Constructor por defecto.
    public EdadException() {
        // Aquí no se realiza ninguna acción específica al lanzar la excepción.
    }

    // Constructor con mensaje personalizado.
    public EdadException(String mensaje) {
        // Llama al constructor de la clase base (Exception) con el mensaje proporcionado.
        super(mensaje);
    }

    // Constructor que valida la edad al instanciar la excepción.
    public EdadException(int edad) throws EdadException {
        // Llama al método validarEdad para verificar la validez de la edad.
        this.validarEdad(edad);
    }

    // Método para validar la edad.
    public void validarEdad(int edad) throws EdadException {
        // Verifica si la edad está dentro del rango especificado.
        if (!(edad >= 18 && edad <= 45)) {
            // Si la edad no está en el rango, lanza una EdadException con un mensaje específico.
            System.out.println("La edad debe estar en el rango de 18 a 45 años");
            throw new EdadException("Error de edad: La edad proporcionada está fuera del rango permitido");
        }
    }
}
