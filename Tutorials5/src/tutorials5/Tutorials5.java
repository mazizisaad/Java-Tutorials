/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorials5;

/**
 *
 * @author Muhammad Azizi Saad
 */
import java.util.*;
public class Tutorials5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // initialization
        Scanner sc = new Scanner(System.in);
        String firstName, lastName, edit;
        double salary;
        
        System.out.println("Enter first name: ");
        firstName = sc.nextLine();
        System.out.println("Enter last name: ");
        lastName = sc.nextLine();
        System.out.println("Enter salary: ");
        salary = sc.nextInt();
        
        Employee e1 = new Employee(firstName, lastName, salary);
       
        System.out.println("Employee name: " +e1.getFirstName()+ " " + e1.getLastName());
        System.out.println(e1.toString());
        
        Scanner sc1 = new Scanner(System.in);
        System.out.println("\nEnter new first name: ");
        edit = sc1.nextLine();
        e1.setFirstName(edit);
        
        System.out.println("The new name is " +e1.getFirstName()+ " " +e1.getLastName());
        
    }
    
}
