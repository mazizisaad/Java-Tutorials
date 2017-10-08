/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorials3;

/**
 *
 * @author Muhammad Azizi Saad
 */
import java.util.*;
public class Tutorials3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // initialization
        String user = "Muhammad Azizi", name;
        Scanner sc = new Scanner(System.in);
        
        // string function
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        
        if (name.length() <6) 
        {
            System.out.println("The name lenght is less than 6.");
        }
        else
        {
            if (user.equalsIgnoreCase(name)) 
            {
                System.out.println("Hi! " +user);
            }
            else
            {  
                System.out.println("You are not the user!");
            }
        
            System.out.println("String length " +name.length());
            System.out.println(name.charAt(6));
            System.out.println(name.replace('m', 'M'));
        }
    }
    
}
