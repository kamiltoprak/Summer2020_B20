package ReplitTry;
/*The LameCalculator class has instance methods that can do simple math operations on two numbers.

        the methods are: plus, minus, multiply and divide .

        all the methods get two ints then the method does the required math operation and returns the result as an int.

        for example:

        LameCalculator lc = new LameCalculator();

        lc.plus(1,1)
        returns:2

        lc.minus(1,1)
        returns:0

        lc.multiply(2,1)
        returns:2

        lc.divide(10,2)
        returns:5*/
public class R219_OOPS {
    public static void main(String[] args) {

        LameCalculator lc = new LameCalculator();
        System.out.println("1+1 = " + lc.plus(1, 1));
        System.out.println("2-3 = " + lc.minus(2, 3));
        System.out.println("2x3 = " + lc.multiply(2, 3));
        System.out.println("10:2 = " + lc.divide(10, 2));
    }
}

class LameCalculator {
    public  int plus(int num1, int num2) {
        int a = num1 + num2;
        return a;
    }

    public  int minus(int num1, int num2) {
        int a = num1 + num2;
        return a;
    }

    public  int multiply(int num1, int num2) {
        int a = num1 + num2;
        return a;

    }

    public  int divide(int num1, int num2) {
        int a = num1 + num2;
        return a;

    }
}





