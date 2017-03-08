/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biometricauthentication;

/**
 *
 * @author Adeesha
 */
public class Controller { 
    
    public void signUp(String usrName,double thumbL,double thumbW,double indexL,double indexW,double middleL,double middleW,double ringL,double ringW,double pinkyL,double pinkyW){
        UserAuth userauth = new UserAuth();
        
        userauth.UserSignUp(usrName,thumbL,thumbW,indexL,indexW,middleL,middleW,ringL,ringW,pinkyL,pinkyW);
    }
    
    public boolean signIn(String usrName){
        UserAuth userauth = new UserAuth();
        return userauth.UserSignIn(usrName);
    }
    
    
}
