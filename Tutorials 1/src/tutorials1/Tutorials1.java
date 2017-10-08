package tutorials1;
//author Muhammad Azizi Saad
import java.util.*;
public class Tutorials1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // initiate variables
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
        
        // capture data into array[]
        for (int a=0; a<5; a++)
        {
            System.out.println("Enter number: ");
            array[a] = sc.nextInt();
        }
        
        // display data from array[]
        System.out.println("Display data in array.");
        for (int b=0; b<5; b++)
        {
            System.out.print(array[b]);
            if (b<4)
            {
                System.out.print("->");
            }
        }
        
        // display min number from the array[]
        int min = array[0];
        int max = array[0];
        for (int c=1; c<5; c++)
        {
            if (array[c]<min)
                min = array[c];
            
            if (array[c]>max)
                max = array[c];
        }
        System.out.println("\nMinimum number is " +min+ ".");
        System.out.println("Maximum number is " +max+ ".");
        
        // find the addition and subtraction of the the minimum and maximum
        int add, sub;
        
        add = min + max;
        sub = min - max;
        
        System.out.println("Addition: " +add);
        System.out.println("Subtraction: " +sub);
        
        // reverse array
        int[] reverse = new int[5];
        int r = 4;
        
        for (int d=0; d<5; d++)
        {
            reverse[r] = array[d];
            r--;
        }
        
        System.out.println("Display reverse array.");
        for (int e=0; e<5; e++)
        {
            System.out.print(reverse[e]);
            if (e<4)
            {
                System.out.print("->");
            }
        }
        
        // sorting array in ascending order
        int[] asc = new int[5];
        int temp = array[0];
        
        for (int f=0; f<5; f++)
        {
            for (int g=0; g<4; g++)
            {
                if (array[g]>array[g+1])
                {
                    temp = array[g];
                    array[g] = array[g+1];
                    array[g+1] = temp;
                }
            }
        }
     
        System.out.println("sorting array into ascending order.");
        for (int g=0; g<5; g++)
        {
            System.out.print(array[g]);
            if (g<4)
            {
                System.out.print("->");
            }
        }
    }
    
}
