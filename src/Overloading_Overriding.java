import java.util.Scanner;

public class Overloading_Overriding {

    public static void main(String[] args){
        Overloading_Overriding ov = new Overloading_Overriding();
        ov.add(3,4);
       ov. add(4,5,3);


    }

    public   void add(int x, int y){
        int sum = x+y;
        System.out.println(sum);
    }

     public  void add(int x,int y,int z){
        System.out.println(x +y+z);
    }

}
