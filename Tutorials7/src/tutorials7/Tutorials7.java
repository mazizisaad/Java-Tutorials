/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorials7;

/**
 *
 * @author Muhammad Azizi Saad
 */
import java.io.*;
public class Tutorials7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception 
    {
        // IO stream
        File file = new File("name.txt");
        int[] num = {1,2,3,4,5};
        
        // serialize
        FileOutputStream fo = new FileOutputStream(file);
        ObjectOutputStream out = new ObjectOutputStream(fo);
        
        for (int i = 0; i < 5; i++) 
        {
            out.writeObject(num);
        }
        
        out.close();
        fo.close();
        
        // deserialize
        FileInputStream fi = new FileInputStream(file);
        ObjectInputStream input = new ObjectInputStream(fi);
        
        int[] num2 = new int[5];
        
        try
        {
            for (int p = 0; p < 5; p++) 
            {
                num2 = (int[])input.readObject();
            }
        }
        catch (IOException ex)
        {
            System.out.println(ex);
        }
        
        for (int q = 0; q < 5; q++) 
        {
            System.out.println(num2[q]);
        }
    }
    
}
