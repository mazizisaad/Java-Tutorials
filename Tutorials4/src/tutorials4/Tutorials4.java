/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorials4;

/**
 *
 * @author Muhammad Azizi Saad
 */
import java.util.*;
public class Tutorials4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initialization
        double a = 0, b= 0, c = 1, div = 0;
        
        // catch and throw the exception
        do
        {
            try
            {
                Scanner sc = new Scanner(System.in);
                
                System.out.print("Enter first value: ");
                a = sc.nextDouble();
                System.out.print("Enter second value: ");
                b = sc.nextDouble();
                  
                div = a/b;
                System.out.println("The answer is " +div);
                c = 2; 
            }
            catch (Exception e)
            {
                System.out.println("Error! Try again.");
            }
            
        } while (c == 1);
        
    }
    
}
