package completed.generics.task4;

public class Calculator {

    public Calculator() {}

    static <E extends Number> Object sum(E x, E y){
        return x.doubleValue()+y.doubleValue();
    }
    static <E extends Number> Object multiply(E x, E y){
        return x.doubleValue()*y.doubleValue();
    }
    static <E extends Number> Object divide(E x, E y){
        return x.doubleValue()/y.doubleValue();
    }
    static <E extends Number> Object substraction(E x, E y){
        return x.doubleValue()-y.doubleValue();
    }
}
