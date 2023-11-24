package completed.generics.task4;

public class Tester {
    public static void main(String[] args) {
        Integer[] intlist = new Integer[10];
        Double[] doublelist = new Double[10];
        for(int i=0; i<10; i++){
            intlist[i] = i;
            doublelist[i] = i*0.3;
        }
        MinMax intmm = new MinMax<Integer>(intlist);
        MinMax doublemm = new MinMax<Double>(doublelist);
        System.out.println("Минимум Integer: "+ intmm.min() + "\nМаксимум Integer: "+ intmm.max());
        System.out.println("Минимум Double: "+ doublemm.min() + "\nМаксимум Double: "+ doublemm.max());

        Calculator c = new Calculator();
        System.out.println("1+2.35 = "+ c.sum(1, 2.35));
        System.out.println("3-5.3598 = "+ c.substraction(3, 5.3598));
        System.out.println("235.342*2 = "+ c.multiply(235.342, 2));
        System.out.println("23.252644/23 = "+ c.divide(23.252644, 23));
    }

}
