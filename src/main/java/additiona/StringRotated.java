package additiona;

public class StringRotated {
    public boolean isStringRotated(String inputOne, String inputTwo) {
        String output = inputOne + inputOne;
        return output.contains(inputTwo);
    }

}
