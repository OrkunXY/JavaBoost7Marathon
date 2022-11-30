package com.bilgeadam.q2;

import java.util.Arrays;
 
class Q204
{
	public static void main(String []args)
	{
	    int arr[] = new int[]{ 9, 7, 5, 3, 7, 7, 3, 18, 2, 0, 7 };
	    int n = arr.length;
	    countFreq(arr, n);
	}
public static void countFreq(int arr[], int n)
{
    boolean visited[] = new boolean[n];
     
    Arrays.fill(visited, false);
 
    // Traverse through array elements and
    // count frequencies
    for (int i = 0; i < n; i++) {
 
        // Skip this element if already processed
        if (visited[i] == true)
            continue;
 
        // Count frequency
        int count = 1;
        for (int j = i + 1; j < n; j++) {
            if (arr[i] == arr[j]) {
                visited[j] = true;
                count++;
            }
        }
        System.out.println(arr[i] + " " + count);
    }
}
 
// Driver code

}