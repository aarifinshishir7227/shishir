/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package munna_lab_work;

import java.util.Scanner;

/**
 *
 * @author aarifin
 */
public class Lab {
    public void check()
    {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        for(int i=1;i<=input;i++)
        {
            int sum = 0;
            for(int j=1;j<=i;j++)
            {
                if(j%2!=0) // if(j%2==1) same thing
                {
                    sum = sum+j;
                }
            }
            System.out.println(i+"\t"+sum);
        }
    }
    
}
