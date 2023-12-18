package completed.pr22;
import java.util.Stack;
import java.util.Scanner;
public class SimpleCalc {
    public static boolean isNumeric(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        Stack<Double> calculator = new Stack<>();
        Scanner sc = new Scanner(System.in);
        double res = 0;
        String current = "1";

        System.out.println("Введите выражение в обратной польской нотации\nЧтобы завершить ввод введите 'result'");
        do{
            current = sc.next();
            if (isNumeric(current)){
                calculator.push(Double.valueOf(current));
            }
            else{
                switch (current) {
                    case "+":
                        res = calculator.pop() + calculator.pop();
                        calculator.push(res);
                        break;
                    case "-":
                        res = calculator.pop() - calculator.pop();
                        calculator.push(res);
                        break;
                    case "*":
                        res = calculator.pop() * calculator.pop();
                        calculator.push(res);
                        break;
                    case "/":
                        res = calculator.pop() / calculator.pop();
                        calculator.push(res);
                        break;
                }
            }
        } while(!current.equals("result"));
        System.out.println(calculator.peek());
    }
}
