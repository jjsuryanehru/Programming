// Problem Link : https://leetcode.com/problems/search-insert-position/description/?envType=problem-list-v2&envId=array

// Search Insert Position  Or Ceiling Searching Position : 

import java.util.*;

public class CeilingSearch{
    // Logic
    public static int toSearch(int[] arr, int target)
    {
        int start = 0 , end = arr.length - 1 ;
        // Method - 1
        while(start < end)
        {
            int mid = start + (end - start) / 2 ;
            if(arr[mid] < target)
                start = mid + 1 ;
            else 
                end = mid ;
        }
        return end ;

        /*
        // Method - 2
        while(start <= end)
        {
            int mid = start + (end - start) / 2 ;
            if(arr[mid] == target)
                return mid ;
            if(arr[mid] < target)
                start = mid + 1 ;
            else 
                end = mid - 1;
        }
        return end ;
        */

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

        int tar = scan.nextInt();

        System.out.println("\nOutput : "+toSearch(arr, tar));

    }
}