package constructor_static_final.Final;

final class FinalClass {
    // constructor_static_final.Final variable
    private final int finalVariable = 1919;

    // constructor_static_final.Final method with package-private access
    final int getFinalVariable() {
        return finalVariable;
    }

    public static void main(String[] args) {
        // Creating an instance of FinalClass
        FinalClass finalObj = new FinalClass();

        // Accessing the final variable and method
        System.out.println("constructor_static_final.Final Variable: " + finalObj.getFinalVariable());
        int finalVariable = 0;
        System.out.println("constructor_static_final.Final Variable: " + finalObj.getFinalVariable());
    }
}
