// tinh trung binh cong cac so nguyen to trong mang
package Mang;

import java.util.Scanner;

public class tbcNguyen_To 
{   public static boolean checkNT(int n)
    {
        if(n<2)
            return false;
        else
        {
           for(int i=2;i<=Math.sqrt(n);i++)
               if(n%i==0)
                   return false;
           return true;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n,dem=0;
        double tbc=0;
        n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        for(int i=0;i<n;i++)
            if(checkNT(a[i])==true)
            {
                tbc += a[i];
                dem++;
            }
        System.out.println(tbc/dem);
    }
}
