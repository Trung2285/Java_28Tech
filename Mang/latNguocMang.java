//Lat nguoc mang
package Mang;

import java.util.Scanner;

public class latNguocMang 
{
    public static void latMang(int[] a,int n)
    {
        int l=0,r=n-1;
        while(l<r)
        {
            int tmp=a[l];
            a[l]=a[r];
            a[r]=tmp;
            l++;r--;
        }
        for(int x:a)
            System.out.print(x+" ");
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        latMang(a, n);
    }
}
