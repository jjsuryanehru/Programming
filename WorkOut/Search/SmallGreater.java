// Problem Link : https://leetcode.com/problems/search-insert-position/description/?envType=problem-list-v2&envId=array

// Search Insert Position  Or Ceiling Searching Position : 

import java.util.*;

public class SmallGreater{
    // Logic
    public static char toSearch(char[] arr, char target)
    {
        int start = 0 , end = arr.length - 1 ;
       
        while(start <= end)
        {
            int mid = start + (end - start) / 2 ;
            if(arr[mid] > target)
                end = mid - 1 ;
            else 
                start = mid + 1 ;
        }
        return arr[start % arr.length] ;
    }

    // Main Method
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input : ");
        // Array Size :
        int size = scan.nextInt();


        // Array Elements :
        char[] arr = new char[size];
        for(int i = 0 ; i < size ; i ++)
        {
            arr[i] = scan.next().charAt(0);
        }

        char tar = scan.next().charAt(0);

        System.out.println("\nOutput : "+toSearch(arr, tar));

    }
}