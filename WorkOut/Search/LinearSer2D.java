// Problem Link : https://www.geeksforgeeks.org/dsa/searching-algorithms-for-a-2d-arrays-matrix/
// Search in an Unsorted 2D Array

// Linear Search in 2 Dimensional : 

import java.util.*;

public class LinearSer2D{
    // Logic
    public static int[] toSearch(int[][] arr , int target)
    {
        for(int i = 0 ; i < arr.length ; i ++)
        {
            for(int j = 0 ; j < arr[i].length ; j ++)
            {
                if(arr[i][j] == target)
                    return new int[] {i,j} ;
            }
        }
        return new int[] {-1 ,-1} ;
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

        int tar = scan.nextInt();

        System.out.println("\nOutput : ");
        System.out.println("Element is Found at index is "+Arrays.toString(toSearch(arr , tar)));

    }
}