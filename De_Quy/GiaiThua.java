//Tổng từ 1 tới n
package De_Quy;
import java.util.Scanner;

public class GiaiThua 
{
    public static int giaiThua(int n)
    {
        if(n==0 || n==1)
            return 1;
        else
            return n * giaiThua(n-1);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.println(n + "! = "+giaiThua(n));
    }
}
