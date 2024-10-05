
package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class sapXepArrList 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ds = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int tmp = sc.nextInt();
            ds.add(tmp);
        }
        //C1:Dùng hàm sort
        ds.sort(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;//-> tăng dần
            }
        });
        for(int x:ds){
            System.out.print(x+" ");
        }
        //C2:Dùng collection
        Collections.sort(ds, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;//-> giảm dần
            }
        });
        System.out.println("");
        for(int x:ds){
            System.out.print(x+" ");
        }        
    }
}
