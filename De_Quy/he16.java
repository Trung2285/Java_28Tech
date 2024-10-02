//Chuyển hệ thập phân sang hệ 16
package De_Quy;

import java.util.Scanner;

public class he16 
{
    public static void dq(int n)
    {
        if(n==0)
            return;
        else
        {
            dq(n/16);
            int r = n%16;
            if(r<=9)
                System.out.print(r);
            else
                System.out.print((char)(r+55));
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dq(n);
        System.out.println("");
    }
}
