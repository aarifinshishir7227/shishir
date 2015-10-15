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
public class ArmStrongNumber {
    public void armstrong_number(){
        for(int value=0;value<1000;value++)
        if(armstrong(value))
            System.out.println(value);
    
    }
    public boolean armstrong(int value){
        int result = 0;
        int check = value;
        while(value!=0)
        {
            int remainder = value % 10;
            result = result + remainder*remainder*remainder;
            value = value / 10;
        }
        return result == check;
    
    }
    
}
