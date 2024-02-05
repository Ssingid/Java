package additiona;

public class SumItem {
    public int getSumItems(int[] arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum;
    }

}
