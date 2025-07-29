// Problem Link : https://www.geeksforgeeks.org/problems/max-consecutive-one/1?page=1&difficulty=Easy&status=solved&sortBy=submissions

// Max Consecutive Bit : 

import java.util.*;

public class ConsituteBit{
    // Logic
    public static int toFindConsitute(int[] arr)
    {
        int maxcnt = 0 , cnt = 0 , prev = -1 ;
        for(int num : arr)
        {
            if((num ^ prev) == 0)
                cnt ++ ;
            else{
                maxcnt = Math.max(maxcnt, cnt) ;
                cnt = 1 ;
            prev = num ;
            }
        }
        return Math.max(maxcnt, cnt) ; 
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

        System.out.println("\nOutput : "+toFindConsitute(arr));

    }
}