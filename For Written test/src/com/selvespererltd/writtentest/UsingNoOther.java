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
public class UsingNoOther {
    public void usingNotOther() {
        int a = 12;
        int b = 13;
        swap(a, b);   
    }
    public void swap(int a,int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a+"\t"+b);
    }
    
}
