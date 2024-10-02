//Tìm chữ số đầu tiên
package De_Quy;

import java.util.Scanner;

public class CSDauTien 
{
    public static int CSDau_Tien(int n)
    {
        if(n<10)
            return n;
        else
            return CSDau_Tien(n/10);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(CSDau_Tien(n));
    }
}
