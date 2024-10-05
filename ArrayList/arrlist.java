//Mang dong
package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class arrlist 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n : ");
        int n=sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();//Khai bao->(Integer,Float,Double,Long,Character,String...) 
        list.add(1);//Thêm phần tử vào cuối(add)
        list.add(2);//1 2
        list.add(3);//1 2 3
        System.out.println(list.size());//in ra số phần tử ArrayList(size)
        for(int i=0;i<list.size();i++)
            System.out.print(list.get(i)+" ");//dùng get để truy cập
        for(int x:list)
            System.out.print(x+" ");//dùng for each
        //Nhập mảng bằng ArrayList
        for(int i=0;i<n;i++)
        {
            int tmp =sc.nextInt();
            list.add(tmp);
        }
        list.clear();//xóa toàn bộ phần tử
        list.isEmpty();//Kiểm tra al rỗng
        list.contains(5);//kiểm tra 5 có trong ds hay không
        list.set(2, 100);//1 2 3 4 5 -> 1 2 100 4 5
        list.remove((Object)4);//xóa phần tử 4 xuất hiện đầu tiên.
        list.remove(4);//xóa phần tử có chir số 4.
        list.indexOf(5);//trả về chỉ số của phần tử 5.Nếu không có trả về -1.
        Object[] b = list.toArray();//chuyển arrlist thành mảng
    }
}
