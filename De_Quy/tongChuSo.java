//Tính tổng chữ số 

package De_Quy;

import java.util.Scanner;

public class tongChuSo 
{
    public static int tongCS(int n)
    {
        if(n<10)
            return n;
        else
            return n%10 + tongCS(n/10);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tongCS(n));
    }
}
