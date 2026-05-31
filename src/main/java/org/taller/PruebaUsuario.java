package org.taller;

public class PruebaUsuario {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Juan", "juan@email.com", "segura123");

        System.out.println("\n============Sistema de validación Usuario============\n");


        ValidacionServicio validacion = new ValidacionServicio();
        System.out.println("Email válido: " + validacion.validarEmail(usuario.getEmail()));
        System.out.println("Contraseña válida: " + validacion.validarContrasena(usuario.getContrasena()));

        AutenticacionServicio auth = new AutenticacionServicio();
        System.out.println("Autenticado: " + auth.autenticar(usuario, "segura123"));

        System.out.println("\n=====================================================\n");
    }
}