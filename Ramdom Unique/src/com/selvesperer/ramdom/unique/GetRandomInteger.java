/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selvesperer.ramdom.unique;

import java.util.Random;

/**
 *
 * @author Dipok Roy
 */
public class GetRandomInteger {
    public int getRandomInteger(int min,int max) {
        if(min >= max) {
            throw new IllegalArgumentException("the max value must be greater than the min value ...");
        }
       Random random = new Random();
       return random.nextInt(max - min + 1)+min;
    
    }
    
}
