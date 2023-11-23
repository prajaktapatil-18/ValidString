import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class CountProblem {

    public static void main(String[] args) {
        int count =0;
        int ans ;
        int[] arr = {12,3,14,56,77,13,13};

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = scan.nextInt();

        System.out.println("Enter differance");
        int diff = scan.nextInt();

        for (int i =0;i<arr.length;i++){
            ans = Math.abs(num-arr[i]);
            if (ans<diff){
                count++;

            }
        }
        System.out.println(count);
    }
}
