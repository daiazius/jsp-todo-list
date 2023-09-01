package com.pedro.treinamentos.login;

public class LoginService {

    public boolean isUserValid(String user, String password) {
        if(user.equals("pedro") && password.equals("teste")) {
            return true;
        }
        else {
            return false;
        }
    }

}
