
package De_Quy;

import java.util.Scanner;

public class soChuSo 
{
    public static int soCS(int n)
    {
        if(n<10)
            return 1;
        else
            return 1 + soCS(n/10);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(soCS(n));
    }
}
