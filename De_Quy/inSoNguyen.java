//in so nguyen Vd 12345 -> 1 2 3 4 5
package De_Quy;

import java.util.Scanner;

public class inSoNguyen 
{
    public static void inSN(int n)
    {
        if(n==0)
            return ;
        else
        {
            inSN(n/10);
            System.out.print(n%10+" ");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        inSN(n);
    }
}
