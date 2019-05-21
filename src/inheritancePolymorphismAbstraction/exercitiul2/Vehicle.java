package inheritancePolymorphismAbstraction.exercitiul2;

public abstract class Vehicle {
    private int speed;
    private int gear;

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public void changeGear(int newGear) {
        this.gear = newGear;
    }

    public void speedUp(int increment) {
        this.speed += increment;
    }

    public void applyBrakes(int decrement) {
        this.speed -= decrement;
    }

    public abstract void printStates();

}
