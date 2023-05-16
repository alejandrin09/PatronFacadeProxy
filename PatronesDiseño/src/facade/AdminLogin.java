/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 *
 * @author alexs
 */
public class AdminLogin {

    public boolean login(String username, String password) {
        if (username.equals("admin") && password.equals("admin123")) {
            System.out.println("Inicio de sesión exitoso como administrador");
            return true;
        } else {
            System.out.println("Inicio de sesión fallido como administrador");
            return false;
        }
    }
}
