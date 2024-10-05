//chèn số X vào vị trí K
package Mang;

import java.util.Scanner;

public class chenX 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),x=sc.nextInt(),k=sc.nextInt();
        int[] a = new int[n+1];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        k--;
        for(int i=n-1;i>=k;i--)
            a[i+1]=a[i];
        a[k]=x;
        for(int i=0;i<=n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
