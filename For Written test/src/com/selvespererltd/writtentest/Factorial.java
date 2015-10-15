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
public class Factorial {
    public int isFactorial(int value) {
        if(value == 1)
            return 1;
        else
            return (value* isFactorial(value - 1));
    }
    
}
