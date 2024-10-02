//Tổ hợp chập K của N
package De_Quy;
import java.util.Scanner;

public class ToHopChapK 
{
    public static int toHop(int n,int k)
    {
        if(k==0 || k==n)
            return 1;
        else
            return toHop(n-1,k-1) + toHop(n-1,k);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        System.out.println("to hop chap "+k+" cua "+n+" la : "+toHop(n,k));
    }
}
