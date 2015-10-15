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
public class StringReverse {
    public void stringreverse() {
        String str = "abs";
        String rev = "";
        for(int i=str.length()-1;i>=0;i--)
        {
            char c = str.charAt(i);
            rev = rev + c;
        }
        System.out.println(rev);
        
    }
    
}
