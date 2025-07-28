// Problem Link : https://www.geeksforgeeks.org/problems/second-largest3735/1?page=1&status=solved&sortBy=submissions

//  Second Largest Element : 

import java.util.*;

public class SecondLarge{
    // Logic
    public static int largestElement(int[] arr)
    {
        int max1 = Integer.MIN_VALUE;
        int max2 =Integer.MIN_VALUE ;

        for(int num : arr)
        {
            if(max1 < num)
            {
                max2 = max1 ;
                max1 = num ; 
            }
            else if(max1 > num && max2 <= num )
                max2 = num ;
        }

        return max2 ;
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