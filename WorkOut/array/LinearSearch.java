// Problem Link : https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1?selectedLang=java

// Linear Search in 1 Dimensional : 

import java.util.*;

public class LinearSearch{
    // Logic
    public static boolean toSearch(int[] arr , int target)
    {
        for(int num : arr)
        {
            if(num == target)
                return true ;
        }
        return false ;
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

        System.out.println("\nOutput : ");
        if(toSearch(arr,tar))
            System.out.println("Element is Found...");
        else
            System.out.println("Element is not Found...");

    }
}