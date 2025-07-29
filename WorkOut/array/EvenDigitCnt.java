// Problem Link : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/?envType=problem-list-v2&envId=array

// Find Numbers with Even Number of Digits : 

import java.util.*;

public class EvenDigitCnt{
    // Logic
    public static int toFindEven(int[] arr)
    {
        int cnt = 0 ;
        for(int num : arr)
        {
            if( ( (int) Math.log10(num) ) % 2 != 0 )
                cnt ++ ;
        }
        return cnt ;
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

        System.out.println("\nOutput : "+toFindEven(arr));

    }
}