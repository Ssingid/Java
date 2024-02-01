package additiona;

public class Factorial {
    public int getFactorial(int number) {
        int factorialNumber = 1;
        for(int i = number; i >= 1; i--) {
            factorialNumber = factorialNumber * i;
        }
        if(number < 0)
            return -1;
        return factorialNumber;
    }
}
