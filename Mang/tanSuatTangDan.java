//Đếm tần suất của từng phần tử tăng dần
package Mang;

import java.util.Arrays;
import java.util.Scanner;

public class tanSuatTangDan 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] dem = new int[1000000];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            dem[a[i]]++;
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            if(dem[a[i]]!=0)
            {
                System.out.println(a[i]+" "+dem[a[i]]);
                dem[a[i]]=0;
            }
        }
    }
}
