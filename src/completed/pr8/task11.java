package completed.pr8;
import java.util.Scanner;

public class task11 {
    public static int countOnes() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            int m = sc.nextInt();
            if (m == 0) {
                return 0;
            } else {
                return countOnes();
            }
        } else if (n == 1) {
            return 1 + countOnes();
        } else {
            return countOnes();
        }
    }

    public static void main(String[] args) {
        System.out.println(countOnes());
    }
}
