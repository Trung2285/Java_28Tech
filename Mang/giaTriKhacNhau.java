//Liệt kê các giá trị khác nhau của Mảng
package Mang;

import java.util.Scanner;

public class giaTriKhacNhau 
{   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        System.out.print(a[0]+" ");
        for(int i=1;i<n;i++)
        {
            int j;
            for(j=0;j<i;j++)
                if(a[j]==a[i])
                    break;
            if(j==i)
                System.out.print(a[i]+" ");
        }
    }
}
