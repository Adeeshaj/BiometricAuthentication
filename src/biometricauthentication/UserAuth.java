/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biometricauthentication;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adeesha
 */
public class UserAuth {
    private static User cacheUser;
    
    public void UserSignUp(String usrName,double thumbL,double thumbW,double indexL,double indexW,double middleL,double middleW,double ringL,double ringW,double pinkyL,double pinkyW){
        SerializationUser loadOb = new SerializationUser();
        List<User> userArr = loadOb.deserialize("src/serialization/Users.ser");
        
        userArr.add(new User(usrName,thumbL,thumbW,indexL,indexW,middleL,middleW,ringL,ringW,pinkyL,pinkyW));
        
        System.out.println("Users :"+ userArr);
       
       
        SerializationUser saveOb = new SerializationUser();
        saveOb.serialize(userArr,"src/serialization/Users.ser");
        System.out.println("done");
        
        User.printUser(userArr.get(userArr.size()-1));
        
    }
    
    public boolean UserSignIn(String usrName){
        SerializationUser loadOb = new SerializationUser();
        List<User> newList = loadOb.deserialize("src/serialization/Users.ser");
        boolean islogged = false;
        for (User user:newList){
            if(user.getUserName().equals(usrName)){
                cacheUser = user;
                
                System.out.println("Login Successful");
                islogged = true;
            }
            
        }
        return islogged;
    }
    
    public static User getCacheUser(){
        return cacheUser;
    }
}
