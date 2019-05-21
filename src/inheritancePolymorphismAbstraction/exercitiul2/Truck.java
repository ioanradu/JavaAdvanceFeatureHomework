package inheritancePolymorphismAbstraction.exercitiul2;

public class Truck extends Vehicle {

    public void printStates() {
        System.out.println("Truck state: gear: " + getGear() + ", speed: " + getSpeed());
    }
}
