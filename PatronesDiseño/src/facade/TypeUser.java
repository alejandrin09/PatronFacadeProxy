/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 *
 * @author alexs
 */
public class TypeUser {

    public static void main(String[] args) {
        LoginFacade facade = new LoginFacade();
        boolean isAdminLoggedIn = facade.loginAsAdmin("admin", "admin123");
        boolean isUserLoggedIn = facade.loginAsUser("user", "user12");

        if (isAdminLoggedIn) {
            System.out.println("Admin");
        } else if (isUserLoggedIn) {
            System.out.println("Usuario");
        } else {
            System.out.println("Inicio de sesión fallido");
        }
    }
}
