public class Demo {

    // A static variable
    static int staticVariable = 10;

    // A final variable (constant)
    final int finalVariable;

    // An instance variable
    int instanceVariable;

    // Constructor to initialize instanceVariable and finalVariable
    public Demo(int instanceVariable) {
        this.instanceVariable = instanceVariable;
        this.finalVariable = 20;
    }

    // A static method
    static void staticMethod() {
        System.out.println("Static method can be called without creating an instance.");
        // Accessing static variable
        System.out.println("Static variable: " + staticVariable);
        // Can't use 'this' in static context
        // System.out.println("Instance variable: " + this.instanceVariable); // This would cause a compilation error
    }

    // A non-static method
    void nonStaticMethod() {
        System.out.println("Non-static method requires an instance to be called.");
        // Accessing instance variable using 'this'
        System.out.println("Instance variable: " + this.instanceVariable);
        // Accessing final variable
        System.out.println("Final variable: " + this.finalVariable);
        // Accessing static variable without 'this'
        System.out.println("Static variable: " + staticVariable);
    }

    public static void main(String[] args) {
        // Calling static method without creating an instance
        Demo.staticMethod();

        // Creating an instance of Demo
        Demo demo = new Demo(30);

        // Calling non-static method using the instance
        demo.nonStaticMethod();

        // Trying to modify final variable (uncommenting the below line would cause a compilation error)
        // demo.finalVariable = 25;

        // Modifying static variable
        Demo.staticVariable = 50;
        System.out.println("Modified Static variable: " + Demo.staticVariable);
    }
}
