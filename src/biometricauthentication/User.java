/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biometricauthentication;

import com.sun.corba.se.impl.orbutil.ObjectWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adeesha
 */
public class User implements Serializable {
    private String UserName;
    private double thumbLength;
    private double thumbWidth;
    private double indexFingerLength;
    private double indexFingerWidth;
    private double middleFingerLength;
    private double middleFingerWidth;
    private double ringFingerLength;
    private double ringFingerWidth;
    private double pinkyLength;
    private double pinkyWidth;
   
   
   
    User(String usrName,double thumbL,double thumbW,double indexL,double indexW,double middleL,double middleW,double ringL,double ringW,double pinkyL,double pinkyW){
       this.UserName = usrName;
       this.thumbLength = thumbL;
       this.thumbWidth = thumbW;
       this.indexFingerLength = indexL;
       this.indexFingerWidth = indexW;
       this.middleFingerLength = middleL;
       this.middleFingerWidth = middleW;
       this.ringFingerLength = ringL;
       this.ringFingerWidth = ringW;
       this.pinkyWidth = pinkyW;
       this.pinkyLength = pinkyL;
    }
    public String getUserName(){
       return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setThumbLength(double thumbLength) {
        this.thumbLength = thumbLength;
    }

    public void setThumbWidth(double thumbWidth) {
        this.thumbWidth = thumbWidth;
    }

    public void setIndexFingerLength(double indexFingerLength) {
        this.indexFingerLength = indexFingerLength;
    }

    public void setIndexFingerWidth(double indexFingerWidth) {
        this.indexFingerWidth = indexFingerWidth;
    }

    public void setMiddleFingerLength(double middleFingerLength) {
        this.middleFingerLength = middleFingerLength;
    }

    public void setMiddleFingerWidth(double middleFingerWidth) {
        this.middleFingerWidth = middleFingerWidth;
    }

    public void setRingFingerLength(double ringFingerLength) {
        this.ringFingerLength = ringFingerLength;
    }

    public void setRingFingerWidth(double ringFingerWidth) {
        this.ringFingerWidth = ringFingerWidth;
    }

    public void setPinkyLength(double pinkyLength) {
        this.pinkyLength = pinkyLength;
    }

    public void setPinkyWidth(double pinkyWidth) {
        this.pinkyWidth = pinkyWidth;
    }

    public double getThumbLength() {
        return thumbLength;
    }

    public double getThumbWidth() {
        return thumbWidth;
    }

    public double getIndexFingerLength() {
        return indexFingerLength;
    }

    public double getIndexFingerWidth() {
        return indexFingerWidth;
    }

    public double getMiddleFingerLength() {
        return middleFingerLength;
    }

    public double getMiddleFingerWidth() {
        return middleFingerWidth;
    }

    public double getRingFingerLength() {
        return ringFingerLength;
    }

    public double getRingFingerWidth() {
        return ringFingerWidth;
    }

    public double getPinkyLength() {
        return pinkyLength;
    }

    public double getPinkyWidth() {
        return pinkyWidth;
    }
    
    public static void printUser(User user){
        System.out.println("User:"+ user.getUserName());
        System.out.println(user.getThumbLength());
        System.out.println(user.getThumbWidth());
        System.out.println(user.getIndexFingerLength());
        System.out.println(user.getIndexFingerWidth());
        System.out.println(user.getMiddleFingerLength());
        System.out.println(user.getMiddleFingerWidth());
        System.out.println(user.getRingFingerLength());
        System.out.println(user.getRingFingerWidth());
        System.out.println(user.getPinkyLength());
        System.out.println(user.getPinkyWidth());
    }
   
   
}
