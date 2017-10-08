/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorials6;

/**
 *
 * @author Muhammad Azizi Saad
 */
import java.io.*;
import java.util.*;
public class Tutorials6 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException 
    {
        // understanding IO
        
        File file = new File("test.txt");
        
        // write to the file
        /*try
        {
            PrintWriter write = new PrintWriter(file);
            write.println("Azizi Saad");
            write.println(22);
            write.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        */
        // read from the file
       try
       {
            Scanner sc = new Scanner(file);
            
            while(sc.hasNextLine())
            {
                //String name = sc.nextLine();
                //int age = sc.nextInt();

               // System.out.println("Name: " +name+ "\nAge: " +age);
                
                System.out.println(sc.nextLine());
             }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }   
}
