//xoa phan tu X trong mang
package Mang;

import java.util.Scanner;

public class xoaX 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),x=sc.nextInt();
        int[] a = new int[n+1];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int pos=-1;
        for(int i=0;i<n;i++)
            if(a[i]==x)
            {
                pos=i;
                break;
            }
        if(pos==-1)
            System.out.println("NOT FOUND");
        else
        {
            for(int i=pos;i<n-1;i++)
                a[i]=a[i+1];
            n--;
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
        }    
    }
}
