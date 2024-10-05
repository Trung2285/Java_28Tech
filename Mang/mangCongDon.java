//in ra mang cong don F: F[0] = a[o] ;f[i] = a[i]+f[i-1]
package Mang;

import java.util.Scanner;

public class mangCongDon 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] f = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i==0)
                f[i]=a[0];
            else
                f[i]=f[i-1]+a[i];
        }
        for(int i=0;i<n;i++){
            System.out.println(f[i]+" ");
        }
    }
}
