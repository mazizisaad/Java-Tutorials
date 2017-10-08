/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorials2;

/**
 *
 * @author Muhammad Azizi Saad
 */
import java.util.*;
public class Tutorials2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initialize variable
        int[][] jix = {{1,2,3},{4,5,6},{7,8,9}};
        
        // moving number
        int source, dest, temp;
        Scanner sc = new Scanner(System.in);
        do 
        {
           for (int a = 0; a < 3; a++) 
            {
                for (int b = 0; b < 3; b++) 
                {
                System.out.print(jix[a][b] +" ");
                }
                System.out.println("\n");
            } 
           
            System.out.println("Enter source number: ");
            source = sc.nextInt();
            System.out.println("Enter destination number: ");
            dest = sc.nextInt();
            
            int p = 0, q = 0, r = 0, s = 0;
            for (int c = 0; c < 3; c++) 
            {
                for (int d = 0; d < 3; d++) 
                {
                    if (jix[c][d] == source) 
                    {
                        p = c;
                        q = d;
                    }
                    
                    if (jix[c][d] == dest) 
                    {
                        r = c;
                        s = d;
                    }
                }
            }
            
            temp = jix[p][q];
            jix[p][q] = jix[r][s];
            jix[r][s] = temp;
            System.out.println("\n");
        } while (source != 0);
        
    }
    
}
