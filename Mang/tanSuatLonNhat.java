//số có tần suất lớn nhất
package Mang;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class tanSuatLonNhat 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        Integer[] a = new Integer[n];
        int[] cnt = new int[1000001];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            cnt[a[i]]++;
        }
        Arrays.sort(a, new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b) {
                if(cnt[a] > cnt[b])
                    return -1;
                else
                    return 1;
            }
        });
        System.out.println(a[0]+" "+cnt[a[0]]);
    }
}
