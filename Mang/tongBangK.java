//đếm số cặp có tổng bằng K
package Mang;

import java.util.Scanner;

public class tongBangK 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt(),dem=0;
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n-1;i++)
        {
            for(int j=i;j<n;j++)
                if(a[i]+a[j]==k)
                    dem++;
        }
        System.out.println(dem);
    }
}
