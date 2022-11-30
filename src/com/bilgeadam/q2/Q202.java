package com.bilgeadam.q2;

import java.util.Arrays;
 
class GFG
{
	public static void main(String []args)
	{
		int A[] = {1,2,2,2,2,3,4,5,5,5,6,6,8,8};

        int count=0;

        Arrays.sort(A); // Dizideki elemanları küçükten büyüğe sırala

        for(int i=0; i<A.length; i++)
        {
            count=0;
            for (int j=0; j<A.length; j++)
            {
                if(A[i]==A[j])
                {
                    count++;

                }
            }

            if(i==0 && A[i+1]==A[i])
            {
System.out.println(String.format("%d 'den %d tane var.", A[i], count));
            }

            if(i==0 && A[i+1]!=A[i])
            {
System.out.println(String.format("%d 'den %d tane var.", A[i], count));
            }


/* dizideki elemanlar küçükten 
büyüğe sıralandığından kendinden
 bir önceki eleman ya aynıdır ya 
farklıdır eğer aynı ise bu elemanı tekrar sayma.*/

            if(i!=0 && A[i-1]!=A[i]) 
            {
System.out.println(String.format("%d 'den %d tane var.", A[i], count));
            }

        }
}
 
// Driver code

}