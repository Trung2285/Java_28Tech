//Kiem tra mang co doi xung hay khong
package Mang;

import java.util.Scanner;

public class mangDoiXung 
{
    public static boolean check_DX(int[] a,int n)
    {
        int l=0,r=n-1;
        while(l<r)
        {
            if(a[l]!=a[r])
                return false;
            else
            {
                l++;
                r--;
            }
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        if(check_DX(a, n))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
