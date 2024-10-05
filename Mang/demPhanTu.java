//đếm phần tử khác nhau
package Mang;

import java.util.Scanner;

public class demPhanTu 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int[] cnt =  new int[1000001];
        for(int i=0;i<n;i++)
        {
            cnt[a[i]]=1;
        }
        int dem=0;
        for(int i=0;i<1000000;i++)
        {
            if(cnt[i]==1)
                dem++;
        }
        System.out.println(dem);
    }
}
