package memory_game;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aarifin
 */
public class Memory_game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String [] colors = {"red","green","blue","white","violet","gray","cyan","ash","navy blue","indigo"};
        ArrayList <Integer> task = new ArrayList<>();
        for(int z=0;z<colors.length;z++)
        {
            task.add(z);
        }
        JOptionPane.showMessageDialog(null,"the colors are given below .. just see that and try to memorize that ");
        for(int ff=0;ff<colors.length;ff++)
            JOptionPane.showMessageDialog(null, " in the "+(ff+1)+ " no index color is --> "+colors[ff]);
        Collections.shuffle(task);
       String []check = new String[colors.length];
        for(int i=0;i<colors.length;i++)
        {

            int getvalue = task.get(i);
            //JOptionPane.showMessageDialog(null,"value for --<"+(getvalue+1)+">--");
            //System.out.println("value for --<"+(getvalue+1)+">--");
            //check [getvalue]= scan.next();
            check[getvalue] = JOptionPane.showInputDialog("please insert input --> "+(getvalue+1));

           if(colors[getvalue] == null ? check[getvalue] == null : colors[getvalue].equals(check[getvalue]))
           {
               //System.out.println("u got perfect one match ");
               JOptionPane.showMessageDialog(null, "u got perfect one,, matched ");
           }
           else
           {
               //System.out.println("ur assumption is false ---> better luck next time ");
               JOptionPane.showMessageDialog(null, "ur assumption is false ---> better luck next time ");
               System.exit(0);
           }
           
        }
        JOptionPane.showMessageDialog(null, "ur memory is perfect ");
    }

}
