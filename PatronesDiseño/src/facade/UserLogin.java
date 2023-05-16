/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 *
 * @author alexs
 */
public class UserLogin {

    public boolean login(String username, String password) {
        if (username.equals("user") && password.equals("user123")) {
            System.out.println("Inicio de sesión exitoso como usuario");
            return true;
        } else {
            System.out.println("Inicio de sesión fallido como usuario");
            return false;
        }
    }
}
