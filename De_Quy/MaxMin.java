// in ra số Mãx và Min
package De_Quy;

import java.util.Scanner;

public class MaxMin 
{
    public static int Max(int n)
    {
        if(n<10)
            return n;
        else
            return Math.max(n%10, Max(n/10));
    }
    public static int Min(int n)
    {
        if(n<10)
            return n;
        else
            return Math.min(n%10, Min(n/10));
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("max = "+Max(n)+"\nmin = "+Min(n));
    }
}
