//Chuyển hệ thập phân sang hệ nhị phân
package De_Quy;

import java.util.Scanner;

public class nhi_Phan 
{
    public static void dq(int n)
    {
        if(n==0)
            return; 
        else
        {
            dq(n/2);
            System.out.print(n%2);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dq(n);
    }
}
