public class loop {
    public static void main(String[] args) {
        // For loop example: Print numbers from 1 to 10
        System.out.println("For loop example: Numbers from 1 to 10");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // New line

        // While loop example: Sum of numbers from 1 to 10
        System.out.println("While loop example: Sum of numbers from 1 to 10");
        int sum = 0;
        int j = 1;
        while (j <= 10) {
            sum += j;
            j++;
        }
        System.out.println("Sum: " + sum);

        // Do-while loop example: Print even numbers from 1 to 10
        System.out.println("Do-while loop example: Even numbers from 1 to 10");
        int k = 1;
        do {
            if (k % 2 == 0) {
                System.out.print(k + " ");
            }
            k++;
        } while (k <= 10);
        System.out.println(); // New line

        // Nested loop example: Multiplication table
        System.out.println("Nested loop example: Multiplication table (1 to 5)");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print((row * col) + "\t");
            }
            System.out.println(); // New line after each row
        }
    }
}
