package Chapter_14.Exercise_1;

public class Calculator {
    public int add(int x, int y){
        return x + y;
    }
    
    // This method could throw an ArithmeticException
    public double divide(int x, int y) throws ArithmeticException {
        return x / y;
    }
}
