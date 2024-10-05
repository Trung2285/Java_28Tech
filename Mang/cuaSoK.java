//Tổng của mọi dạy con liên tiếp cỡ K
package Mang;

import java.util.Scanner;

public class cuaSoK 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),k=sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int sum=0;
        for(int i=0;i<k;i++)
            sum+=a[i];
        System.out.print(sum+" ");
        for(int i=1;i<n-k+1;i++)
        {
            sum=sum-a[i-1]+a[i+k-1];
            System.out.print(sum+" ");
        }
    }
}
