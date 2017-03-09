/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biometricauthentication;

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
    
    public boolean UserSignIn(String usrName,double fing1L,double fing1W,double fing2L, double fing2W, String fing1,String fing2){
        SerializationUser loadOb = new SerializationUser();
        List<User> newList = loadOb.deserialize("src/serialization/Users.ser");
        int flag = 0;
        double error = 2.0;
        boolean islogged = false;
        for (User user:newList){
            if(user.getUserName().equals(usrName)){
                System.out.println(user.getUserName());
                switch (fing1) {
                    case "thumb":
                        if(user.getThumbLength()+ error > fing1L && user.getThumbLength() - error < fing1L && user.getThumbWidth() + error > fing1W && user.getThumbWidth() - error < fing1W){
                            flag += 1;
                        }   break;
                    case "Index finger":
                        if((user.getIndexFingerLength() + error) > fing1L && (user.getIndexFingerLength() - error) < fing1L && (user.getIndexFingerWidth()+ error >fing1W) && (user.getIndexFingerWidth() - error) <fing1W){
                            flag += 1;
                        }   break;
                    case "middle finger":
                        if((user.getMiddleFingerLength() + error) > fing1L && (user.getMiddleFingerLength() - error) < fing1L && (user.getMiddleFingerWidth()+error) > fing1W && (user.getMiddleFingerWidth()-error)<fing1W){
                            flag += 1;
                        }   break;
                    case "ring finger":
                        if((user.getRingFingerLength() + error) > fing1L && (user.getRingFingerLength() - error) < fing1L && (user.getRingFingerWidth() +error)> fing1W && (user.getRingFingerWidth()-error)< fing1W){
                            flag += 1;
                    }   break;
                    case "pinky":
                        if((user.getPinkyLength()+error) > fing1L && (user.getPinkyLength()-error) < fing1L && (user.getPinkyWidth()+error)>fing1W && (user.getPinkyWidth()-error)<fing1W){
                            flag += 1;
                    }   break;
                }
                
                
                switch (fing2) {
                    case "thumb":
                        if(user.getThumbLength()+ error > fing2L && user.getThumbLength() - error < fing2L && user.getThumbWidth() + error > fing2W && user.getThumbWidth() - error < fing2W){
                            flag += 1;
                        }   break;
                    case "Index finger":
                        if((user.getIndexFingerLength() + error) > fing2L && (user.getIndexFingerLength() - error) < fing2L && (user.getIndexFingerWidth()+ error >fing2W) && (user.getIndexFingerWidth() - error) <fing2W){
                            flag += 1;
                        }   break;
                    case "middle finger":
                        if((user.getMiddleFingerLength() + error) > fing2L && (user.getMiddleFingerLength() - error) < fing2L && (user.getMiddleFingerWidth()+error) > fing2W && (user.getMiddleFingerWidth()-error)<fing2W){
                            flag += 1;
                        }   break;
                    case "ring finger":
                        if((user.getRingFingerLength() + error) > fing2L && (user.getRingFingerLength() - error) < fing2L && (user.getRingFingerWidth() +error)> fing2W && (user.getRingFingerWidth()-error)< fing2W){
                            flag += 1;
                    }   break;
                    case "pinky":
                        if((user.getPinkyLength()+error) > fing2L && (user.getPinkyLength()-error) < fing2L && (user.getPinkyWidth()+error)>fing2W && (user.getPinkyWidth()-error)<fing2W){
                            flag += 1;
                    }   break;
                }
                
                
                if(flag == 2){
                    cacheUser = user;
                
                    System.out.println("Login Successful");
                    islogged = true;
                }
                
            }
            
        }
        return islogged;
    }
    
    public static User getCacheUser(){
        return cacheUser;
    }
}
