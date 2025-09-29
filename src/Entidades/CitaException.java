package Entidades;

//Manejo de errores granular

public class CitaException extends RuntimeException {
    public CitaException(String message) {
        super(message);
    }
}
