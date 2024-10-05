//in ra số lớn hơn 2 số liền kề VD: 1 3 2 -> 3
package Mang;

import java.util.Scanner;

public class lienKeLonHon 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=1;i<n-1;i++)
            if(a[i]>a[i-1]&& a[i]>a[i+1])
                System.out.print(a[i]+" ");
    }
}
