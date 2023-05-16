/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxy;

/**
 *
 * @author alexs
 */
public class RealAuthenticator implements Authenticator {

    @Override
    public void login(String username, String password) {
        System.out.println("Iniciando sesión para el usuario: " + username);
    }
}
