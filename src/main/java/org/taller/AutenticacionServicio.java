package org.taller;

// AutenticacionServicio — solo autenticación
public class AutenticacionServicio {
    public boolean autenticar(Usuario usuario, String contrasenaIngresada) {
        return usuario.getContrasena().equals(contrasenaIngresada);
    }
}