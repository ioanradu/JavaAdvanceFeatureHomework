package inheritance;

public class Dog extends Animal {
    private String color;

    public Dog(int age, int numberOfLegs, String vegetarian, String color) {
        super(age, numberOfLegs, vegetarian);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void bark() {
        System.out.println("The dog is barking");
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                "color='" + color + '\'';
    }
}
