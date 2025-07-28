// Problem Link : https://www.geeksforgeeks.org/problems/third-largest-element/1?page=1&difficulty=Easy&status=solved&sortBy=submissions

// Third Largest Element : 

import java.util.*;

public class ThirdLarge{
    // Logic
    public static int largestElement(int[] arr)
    {
        int max1 = -1;
        int max2 = max1 ;
        int max3 = max2 ;

        for(int num : arr)
        {
            if(max1 < num)
            {
                max3 = max2 ;
                max2 = max1 ;
                max1 = num ; 
            }
            else if(max2 < num)
            {
                max3 = max2 ;
                max2 = num ; 
            }
            else if(max3 < num)
                max3 = num ;
        }

        return max3 ;
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