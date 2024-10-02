//Tìm UClN bằng pp Ơcolit
package De_Quy;
import java.util.Scanner;

public class UCLN_O 
{
    public static int UCLN(int a,int b)
    {
        if(a%b==0)
            return b;
        else
            return UCLN(b,a%b);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a=sc.nextInt();b=sc.nextInt();
        System.out.println("UCLN la : " + UCLN(a,b));
    }
}