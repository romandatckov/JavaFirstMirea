package completed.pr18;
import java.util.Scanner;
public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        } catch ( NumberFormatException e) {
            System.out.println("Attempted operation with wrong input format");
        }
        finally {
            System.out.println("Success!");
        }
    }
}
