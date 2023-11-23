import java.util.Scanner;

public class RatCountHouse {
    int count = 0;
    int TotalRat = 0;
    int sum = 0;

    public static void main(String[] args) {
        RatCountHouse ratCountHouse = new RatCountHouse();

        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of rat");
        int TotalRat = scan.nextInt();

        ratCountHouse.count();
    }



        public void count () {
            RatCountHouse ratCountHouse = new RatCountHouse();
            int allFod = 2 * TotalRat;


            int arr[] = {3, 5, 7, 4, 2, 8, 5};

            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
                count++;
                if (sum >= allFod) {
                    break;
                }

            }

        }

}


