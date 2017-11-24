/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.context.FacesContext;

/**
 *
 * @author Student
 */
@Named(value = "userBean")
@SessionScoped
public class UserBean implements Serializable {

    private String login, password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private boolean logged;

    public String login() {
        if ("ala".equals(login)) {
            logged = true;
            return "/index.xhtml";
        }
        logged = false;
        return "/index";
    }

    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().
                invalidateSession();
        logged = false;
        return "/index";
    }

    public boolean isLogged() {
        return logged;
    }

    public UserBean() {
    }

}
