import java.util.Scanner;

public class ValidString {
    public static void main(String[] args) {
        int count1 =0;
        int count2 =0;


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string in the form of * and #");
        String str = scan.nextLine();

        for (int i =0;i<str.length();i++){
            if (str.charAt(i)=='#'){
                count1++;

            }else {
               count2++;
            }
        }
        if (count1 == count2){
            System.out.println("0 number of # and * are equal");
        }else {
            System.out.println(count2-count1);
        }
    }
}