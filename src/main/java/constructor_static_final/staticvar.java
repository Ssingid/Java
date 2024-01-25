package constructor_static_final;

public class staticvar {
    // Static variable
    private static int staticVariable = 0;

    // Static method
    public static int getStaticVariable() {
        return staticVariable;


    }

    public static void main(String[] args) {

        //constructor_static_final.staticvar s=new constructor_static_final.staticvar();
        System.out.println("Static Variable: " + staticvar.getStaticVariable());
        staticvar.staticVariable = 42;
        System.out.println("Static Variable (after modification): " + staticvar.getStaticVariable());

    }
}
