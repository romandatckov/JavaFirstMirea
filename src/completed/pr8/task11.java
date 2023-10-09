package completed.pr8;
import java.util.Scanner;
public class task11 {
    public static int rec() {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int num = sc.nextInt();
        count+=rec();
        if (num==1){
            count+=1;
            return count;
        }
    }

}
