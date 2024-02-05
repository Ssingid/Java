package additiona;

public class SwappingWithOutThird {
    public int[] getSwappingWithOutThird(int numberOne, int numberTwo) {
        numberOne = numberOne * numberTwo;
        numberTwo = numberOne / numberTwo;
        numberOne /= numberTwo;
        return new int[]{numberOne, numberTwo};
    }

}
