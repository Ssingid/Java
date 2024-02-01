package additiona;

public class Swap {

    public int[] swappingElement(int a, int b) {
        int[] swappingElement = new int[2];
        a = a + b;
        b = a - b;
        a = a - b;
        swappingElement[0] = a;
        swappingElement[1] = b;
        return swappingElement;
    }
}
