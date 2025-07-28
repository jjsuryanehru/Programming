// Problem Link : https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1

// Largest Element : 

import java.util.*;

public class LargestElement{
    // Logic
    public static int largestElement(int[] arr)
    {
        int max1 = Integer.MIN_VALUE;

        for(int num : arr)
        {
            if(max1 < num)
                max1 = num ; 
        }

        return max1 ;
    }

    // Main Method
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input : ");
        // Array Size :
        int size = scan.nextInt();
        // Array Elements :
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i ++)
        {
            arr[i] = scan.nextInt();
        }

        System.out.println("\nOutput : ");
        System.out.println(largestElement(arr));
    }
}