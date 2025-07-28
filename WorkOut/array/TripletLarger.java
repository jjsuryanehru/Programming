// Problem Link : https://www.geeksforgeeks.org/problems/three-great-candidates0515/1?page=2&status=solved&sortBy=submissions

// Three Great Candidates : 

import java.util.*;

public class TripletLarger{
    // Logic
    public static int largestElement(int[] arr)
    {
        int max1 = Integer.MIN_VALUE;
        int max2 = max1 ;
        int max3 = max2 ;
        int min1 = Integer.MAX_VALUE ;
        int min2 = min1 ;


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

            if(min1 > num)
            {
                min2 = min1 ;
                min1 = num ;
            }
            else if(min2 > num)
                min2 = num ;
        }
        return Math.max(max1*max2*max3 , max1*min1*min2) ;
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