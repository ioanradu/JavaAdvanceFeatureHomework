package inheritancePolymorphismAbstraction.exercitiul2;

public class Bus extends Vehicle {

    public void printStates() {
        System.out.println("Bus state: gear: " + getGear() + ", speed: " + getSpeed());
    }
}
