//Tính a^b
package De_Quy;
import java.util.Scanner;

public class luyThua 
{
    public static long luyThua(long a,long b)
    {
        if(b==0)
            return 1;
        long X = luyThua(a,b/2);
        if(b%2==1)
            return X * X * a;
        else
            return (int) (X * X);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a+"^"+b+" = "+luyThua(a,b));
    }
}
