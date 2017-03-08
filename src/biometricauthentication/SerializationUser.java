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

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SerializationUser {
    public void serialize(List<User> uList,String file ){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(uList);
            
        } catch (IOException ex) {
            Logger.getLogger(SerializationUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<User> deserialize(String file ){
        List<User> uList = null;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            uList = (List<User>) in.readObject();
            
        } catch (IOException ex) {
            Logger.getLogger(SerializationUser.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SerializationUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return uList;
    }
}
