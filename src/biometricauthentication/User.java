/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biometricauthentication;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adeesha
 */
public class User implements Serializable {
    private String UserName;
    
   
    private float Height;
   
    User(String usrName){
       this.UserName = usrName;
    }
    public String getUserName(){
       return UserName;
    }
   
    public float getHeight(){
       return Height;
    }
}
