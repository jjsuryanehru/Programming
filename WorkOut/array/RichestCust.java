// Problem Link : https://leetcode.com/problems/richest-customer-wealth/description/?envType=problem-list-v2&envId=array

// Richest Customer Wealth : 

import java.util.*;

public class RichestCust{
    // Logic
    public static int toFindLarger(int[][] arr)
    {
        int max = Integer.MIN_VALUE ;
        for(int nums[] : arr)
        {
           int sum = 0 ;
           for(int num : nums)
           {
                sum += num ;
           }
           if(max < sum)
            max = sum ;
        }
        return max ;
    }

    // Main Method
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input : ");
        // Array Size :
        int rSize = scan.nextInt();
        int cSize = scan.nextInt();


        // Array Elements :
        int[][] arr = new int[rSize][cSize];
        for(int i = 0 ; i < rSize ; i ++)
        {
            for(int j = 0 ; j < cSize ; j ++)
            {  
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("\nOutput : "+toFindLarger(arr));

    }
}