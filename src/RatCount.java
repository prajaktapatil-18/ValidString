import java.util.Scanner;

public class RatCount {
    public static int solve(int r, int unit, int arr[], int n) {
        if (arr == null)
            return -1;

        int res = r * unit;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            count++;
            if (sum >= res)
                break;
        }
        if (sum < res)
            return 0;
            return count;



    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int unit =scan.nextInt();
        int n = scan.nextInt();
        int arr[] = new int[n];

        for (int i =0;i<n ;i++){
            arr[i] = scan.nextInt();
            System.out.println(solve(r,unit,arr,n));

        }

    }
}
