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
public class PrimeNumber {
    public void isPrime() {
        int value = 2;
        int count =0;
        for(int i=1;i<=value;i++){
            if(value%i==0)
                count++;
        }
        if(count==2)
            System.out.println("is prime");
        else
            System.out.println("is not prime");
    }
    
}
