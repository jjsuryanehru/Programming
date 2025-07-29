// Problem Link : https://www.geeksforgeeks.org/problems/binary-search-1587115620/1?page=1&difficulty=Easy&status=solved&sortBy=submissions

// Binary Search : 

import java.util.*;

public class BinarySearch{
    // Logic
    public static int toSearch(int[] arr, int target)
    {
        int start = 0 , end = arr.length - 1 ;
        while(start <= end)
        {
            int mid = start + (end - start) / 2 ;
            if(arr[mid] == target)
                return mid ;
            else if(arr[mid] < target)
                start = mid + 1 ;
            else 
                end = mid - 1 ;
        }
        return -1 ;
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