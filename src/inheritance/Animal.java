package inheritance;

public class Animal {

    private int age;
    private int numberOfLegs;
    private String vegetarian;

    public Animal(int age, int numberOfLegs, String vegetarian) {
        this.age = age;
        this.numberOfLegs = numberOfLegs;
        this.vegetarian = vegetarian;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(String vegetarian) {
        this.vegetarian = vegetarian;
    }

    public void eat() {
        System.out.println("Animal is eating!");
    }

    @Override
    public String toString() {
        return "age=" + age +
                ", numberOfLegs=" + numberOfLegs +
                ", vegetarian='" + vegetarian + '\'';
    }
}
