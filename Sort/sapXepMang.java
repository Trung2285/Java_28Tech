
package Sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class sapXepMang 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        Integer[] a = new Integer[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a, new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b) {
                if(a > b )
                    return -1;
                else
                    return 1;
            }
        });
        for(int x:a)
            System.out.print(x+" ");
    }
}
