//Tìm UClN bằng pp trừ dần
package De_Quy;
import java.util.Scanner;

public class UCLN_TD 
{
    public static int UCLN(int a,int b)
    {
        if(a==b)
            return a;
        else if(a > b)
                return UCLN(a-b,b);
        else
                return UCLN(a,b-a);
            
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a=sc.nextInt();b=sc.nextInt();
        System.out.println("UCLN la : "+UCLN(a,b));
    }
}
