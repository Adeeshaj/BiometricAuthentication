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
    
    public void UserSignUp(String usrName){
        ArrayCls arr = new ArrayCls();
        SerializationUser loadOb = new SerializationUser();
        List userArr = loadOb.deserialize("src/serialization/Users.ser");
        
        userArr.add(new User(usrName));
        
        System.out.println("Users :"+ userArr);
        
        SerializationUser saveOb = new SerializationUser();
        saveOb.serialize(userArr,"src/serialization/Users.ser");
        System.out.println("done");
        
        
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
