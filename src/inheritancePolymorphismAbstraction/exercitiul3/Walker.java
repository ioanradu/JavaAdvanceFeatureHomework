package inheritancePolymorphismAbstraction.exercitiul3;

public class Walker implements Walk, Breath {

    @Override
    public void walk() {
        System.out.println("A walker can walk.");
    }

    @Override
    public void breath() {
        System.out.println("A walker can breath.");
    }
}
