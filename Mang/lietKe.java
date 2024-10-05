//Liet ke so nto,so thuan nghich,so 9 phuong,tong cs la so nto
package Mang;

import java.util.Scanner;

public class lietKe 
{
    public static boolean checkNT(int n)
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
    public static boolean soThuan_Nghich(int n)
    {
        int res=0,ans=n;
        while(n>0)
        {
            res*=10 + n%10;
            n/=10;
        }
        return res==ans;
    }
    public static boolean so9P(int n)
    {
        double sqrt = Math.sqrt(n);
        return (sqrt * sqrt == n);
    }
    public static int tongCS(int n)
    {
        if(n<10)
            return n;
        else
            return n%10 + tongCS(n/10);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("So nguyen to : ");
        for(int i=0;i<n;i++)
            if(checkNT(a[i]))
                System.out.print(a[i]+" ");
        System.out.println("\nSo thuan nghich : ");
        for(int i=0;i<n;i++)
            if(soThuan_Nghich(a[i]))
                System.out.print(a[i]+" ");
        System.out.println("\nSo chin phuong : ");
        for(int i=0;i<n;i++)
            if(so9P(a[i]))
                System.out.print(a[i]+" ");
        System.out.println("\nSo co tong cs la so nguyen to : ");
        for(int i=0;i<n;i++)
            if(checkNT(tongCS(a[i])))
                System.out.print(a[i]+" ");
    }
}
