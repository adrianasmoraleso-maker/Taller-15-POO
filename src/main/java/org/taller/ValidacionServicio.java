package org.taller;

// ValidacionServicio — solo validación de datos
public class ValidacionServicio {
    public boolean validarEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    public boolean validarContrasena(String contrasena) {
        return contrasena.length() >= 8;
    }
}