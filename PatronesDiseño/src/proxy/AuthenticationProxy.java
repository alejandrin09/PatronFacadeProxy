/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxy;

/**
 *
 * @author alexs
 */
public class AuthenticationProxy implements Authenticator {

    private Authenticator realAuthenticator;
    private LoginLogger loginLogger;

    public AuthenticationProxy() {
        this.realAuthenticator = new RealAuthenticator();
        this.loginLogger = new LoginLogger();
    }

    @Override
    public void login(String username, String password) {
        loginLogger.log(username);
        realAuthenticator.login(username, password);
    }

}
