//liet ke cac phan tu trai dau
package Mang;

import java.util.Scanner;

public class traiDau 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                if(1L * a[0]*a[1] < 0)
                    System.out.print(a[0]+" ");
            }
            else if(i==n-1)
            {
                if(1L * a[n-1]*a[n-2]<0)
                        System.out.print(a[n-1]+" ");
            }
            else
            {
                if(1L * a[i]*a[i+1]<0 || 1L*a[i]*a[i-1]<0)
                        System.out.print(a[i]+" ");
            }
        }
    }
}
