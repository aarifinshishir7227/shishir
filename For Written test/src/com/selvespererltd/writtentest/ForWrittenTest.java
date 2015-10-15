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
public class ForWrittenTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FibonacciSeries fs = new FibonacciSeries();
        fs.fibonacci();
        CompareCheck comp = new CompareCheck();
        comp.isCompare();
        ArmStrongNumber asn = new ArmStrongNumber();
        asn.armstrong_number();
        StringReverse reverse = new StringReverse();
        reverse.stringreverse();
        PrimeNumber pn = new PrimeNumber();
        pn.isPrime();
        UsingNoOther uno = new UsingNoOther();
        uno.usingNotOther();
        Factorial fact = new Factorial();
        int i = fact.isFactorial(5);
        System.out.println(i);
    }
    
}
