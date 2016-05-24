package selectionsort;

import java.util.Scanner;
/**
 *simple selection sort using user input
 * selection sort is O(n^2)
 * 
 * @author Alejandro Guzman
 * Software Engineering major - UTD
 */
public class SelectionSort 
{
    public static void main(String[] args) 
    {
        int[] array;
        int size;
        Scanner scan = new Scanner(System.in);
        int smallestNumber;
        int indexHolder;
        
        System.out.print("Please enter the number of elements you want sorted: ");
        size = scan.nextInt();
        array = new int[size];
        
        for(int i = 0; i < size; i++)
        {
            System.out.print("Please enter the " + (i+1) + " number: ");
            array[i] = scan.nextInt();
        }
        
        for(int a = 0; a < size; a++)
        {
            smallestNumber = array[a];
            indexHolder=a;
            for(int j = a; j < size; j++)
            {
                if(array[j] < smallestNumber)
                {
                    smallestNumber = array[j];
                    indexHolder = j;
                }
            }
            array[indexHolder] = array[a];
            array[a] = smallestNumber;
        }
        
        System.out.println("\n");
        System.out.println("The elements in sorted order are: ");
        
        for(int p = 0; p < size; p++)
        {
            System.out.print(array[p] + ", ");
        }
    }
    
}
