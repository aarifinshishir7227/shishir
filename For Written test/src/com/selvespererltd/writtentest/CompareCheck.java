/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selvespererltd.writtentest;

/**
 *
 * @author aarifin
 */
public class CompareCheck {
    public void isCompare(){
        byte age1 = 12;
        byte age2 = 12;
        
        if(!ageCompare(age1, age2))
            System.out.println("age of two employee is not same..");
        else
            System.out.println("age of two employee is same..");
        
    }
    public boolean ageCompare(byte age1, byte age2)
    {
        return age1 == age2;
    }
    public boolean nameCompare(String name1, String name2){
        if(name1.equals(name2))
           return true;
        else
            return false;
    }
    public boolean departmentCompare(String dept1,String dept2){
        if(dept1.equals(dept2))
           return true;
        else
            return false;
    }
    
}
