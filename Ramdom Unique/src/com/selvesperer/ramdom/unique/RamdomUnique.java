/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selvesperer.ramdom.unique;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Dipok Roy
 */
public class RamdomUnique {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int minValue = Integer.parseInt(read.readLine());
        int maxValue = Integer.parseInt(read.readLine());
        GetRandomInteger gri = new GetRandomInteger();
        Set <Integer> set = new HashSet();
        List<Integer> list = new LinkedList();
        for(int i=0;i<12;i++)
            set.add(gri.getRandomInteger(minValue, maxValue));
        list.addAll(set);
        for(int i=0;i<set.size();i++) {
           // System.out.println(list.get(i));
        }
        Collections.sort(list);
        /**
         * for ascending order sorting 
         */
        System.out.println("for ascending order sorting..");
        list.stream().forEach((list1) -> {
            System.out.println(list1);
        });
        /**
         * for descending order sorting..
         */
        System.out.println("for descending order sorting...");
        for(int i = list.size()-1;i>=0;i--)
            System.out.println(list.get(i));
        
        /**
         * add element in the list 
         */
        System.out.println("please enter value for add element in the list -- > ");
        int number = Integer.parseInt(read.readLine());
        if(number <= maxValue && number >= minValue)
            if(set.add(number))
                    list.add(number);
        System.out.println(list);
        /**
         * delete element from the list ..
         */
        System.out.println("please enter value for remove element in the list -- > ");
        int input = Integer.parseInt(read.readLine());
        if(input <= maxValue && input >= minValue)
            for(int i=0;i<list.size();i++) {

            if(input == list.get(i)) {
                list.remove(i);
            }
            }
        System.out.println(list);
        /**
         * for replace element by index ...
         */
        System.out.println("please Enter value for replace --> ");
        int replaceValue = Integer.parseInt(read.readLine());
   
            for(int i=0;i<list.size();i++) {

            if(replaceValue == list.get(i)) {
                list.remove(i);
                list.add(i,Integer.parseInt(read.readLine()));
            }
            }
        System.out.println(list);

    }
    
}
