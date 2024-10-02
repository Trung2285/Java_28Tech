//Tổng từ 1 tới n
package De_Quy;
import java.util.Scanner;

public class Tong 
{
    public static int tong(int n)
    {
        if(n==1)
            return 1;
        else
            return n + tong(n-1);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.println("Tong = "+tong(n));
    }
}
