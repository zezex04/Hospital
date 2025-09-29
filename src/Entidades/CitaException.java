package Entidades;

import lombok.experimental.StandardException;

//Manejo de errores granular

public class CitaException extends RuntimeException {
    public CitaException(String message) {
        super(message);
    }
}
