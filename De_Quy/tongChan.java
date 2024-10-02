
package De_Quy;

import java.util.Scanner;

public class tongChan 
{
    public static int tongChan(int n)
    {
        if(n%2!=0)
            return tongChan(n/10);
        else
            if(n<10)
                return n;
        else
                return n%10 + tongChan(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.println(tongChan(n));
        
    }
}
