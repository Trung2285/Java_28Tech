//Tìm số Fibo thứ n
package De_Quy;
import java.util.Scanner;

public class FIbonaci 
{
    public static int Fibo(int n)
    {
        if(n==1 || n==2)
            return 1;
        else
            return Fibo(n-1) + Fibo(n-2);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.println("So fibo thu "+n +" la : "+Fibo(n));
    }
}