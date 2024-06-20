class Animal {
    // Superclass method
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    // Overriding the superclass method
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Another subclass
class Cat extends Animal {
    // Overriding the superclass method
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Create an Animal object
        Animal myDog = new Dog(); // Create a Dog object
        Animal myCat = new Cat(); // Create a Cat object

        myAnimal.makeSound(); // Calls the method in Animal class
        myDog.makeSound(); // Calls the overridden method in Dog class
        myCat.makeSound(); // Calls the overridden method in Cat class
    }
}
