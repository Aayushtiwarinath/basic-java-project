public class SimpleCalculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

        // Calling overloaded add methods
        int sum1 = calculator.add(2, 3);  // Calls the method with two integer parameters
        int sum2 = calculator.add(1, 2, 3);  // Calls the method with three integer parameters

        System.out.println("Sum of 2 and 3: " + sum1);
        System.out.println("Sum of 1, 2, and 3: " + sum2);
    }
}
