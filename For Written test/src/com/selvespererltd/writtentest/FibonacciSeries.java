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
public class FibonacciSeries {
    public void fibonacci(){
        long first = 0;
        long second = 1;
        long value1;
        System.out.print(second);
        for(int i=2;i<=12;i++)
        {
            value1 = first + second;
            System.out.print("\t"+value1);
            first = second;
            second = value1;
        }
    }
    
}
