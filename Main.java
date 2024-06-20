class Box {
    double width;
    double height;
    double depth;

    // Constructor used when all dimensions are specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Constructor used when no dimensions are specified
    Box() {
        width = -1;  // Use -1 to indicate an uninitialized box
        height = -1;
        depth = -1;
    }

    // Constructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }

    // Method to calculate the volume of the box
    double volume() {
        return width * height * depth;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create boxes using different constructors
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myCube = new Box(7);

        // Get the volume of the first box
        System.out.println("Volume of myBox1 is " + myBox1.volume());

        // Get the volume of the second box
        System.out.println("Volume of myBox2 is " + myBox2.volume());

        // Get the volume of the cube
        System.out.println("Volume of myCube is " + myCube.volume());
    }
}
