package inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(5, 4, "vegetarian");
        System.out.println("Animal is " + animal.getAge() + " years old and has got " + animal.getNumberOfLegs() + " legs and is " + animal.getVegetarian() + ".");
        animal.eat();

        Dog dog = new Dog(3, 4, "not", "white");
        System.out.println("Dog is " + dog.getAge() + " years old and has got " + dog.getNumberOfLegs() + " legs and is " + dog.getVegetarian() + " vegetarian.");
        Animal dog1 = new Dog(4, 4, "no", "brown");
        dog.bark();
        ((Dog) dog1).bark(); // cast

        Animal animal1 = new Animal(5, 4, "vegetarian");
        Animal dog2 = new Dog(6, 4, "no", "black");
        System.out.println(animal1.toString());
        System.out.println(dog2.toString());

       printDetails(animal1);
       printDetails(dog2);
    }

    public static void printDetails(Animal animal2) {

        System.out.println(animal2.toString());
    }
}