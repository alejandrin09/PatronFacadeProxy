/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 *
 * @author alexs
 */
public class LoginFacade {

    private AdminLogin adminLogin;
    private UserLogin userLogin;

    public LoginFacade() {
        adminLogin = new AdminLogin();
        userLogin = new UserLogin();
    }

    public boolean loginAsAdmin(String username, String password) {
        return adminLogin.login(username, password);
    }

    public boolean loginAsUser(String username, String password) {
        return userLogin.login(username, password);
    }
}
