package constructor_static_final;

public class ChildClass extends ParentClass {
    // Instance variable in the child class
    private int childVariable;

    // Constructor to initialize both instance variables
    public ChildClass(int parentVariable, int childVariable) {
        super(parentVariable); // Call the constructor of the parent class
        this.childVariable = childVariable;
    }

    // Overloaded constructor with only one parameter to initialize child class variable
    public ChildClass(int childVariable) {
        super(40); // Default value for parentVariable
        this.childVariable = childVariable;
    }

    // Additional method to get childVariable
    public int getChildVariable() {
        return childVariable;
    }

    public static void main(String[] args) {
        // Creating instances of constructor_static_final.ParentClass and constructor_static_final.ChildClass
        ParentClass parentObj = new ParentClass(10);
        ChildClass childObj1 = new ChildClass(20, 30);
        ChildClass childObj2 = new ChildClass(50);

        // Accessing instance variables
        System.out.println("Parent Variable: " + parentObj.parentVariable);

        System.out.println("Child Variables for childObj1: " + childObj1.parentVariable + ", " + childObj1.getChildVariable());

        System.out.println("Child Variables for childObj2: " + childObj2.parentVariable + ", " + childObj2.getChildVariable());
    }
}
