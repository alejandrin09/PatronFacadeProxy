/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxy;

/**
 *
 * @author alexs
 */
public class User {

    public static void main(String[] args) {
        Authenticator authenticator = new AuthenticationProxy();
        authenticator.login("Pablo", "password123");
    }
}
