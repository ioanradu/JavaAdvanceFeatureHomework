package inheritancePolymorphismAbstraction.exercitiul3;

public class Swimmer implements Swim, Breath {

    @Override
    public void swim() {
        System.out.println("A swimmer can swim.");
    }

    @Override
    public void breath() {
        System.out.println("A swimmer can breath.");
    }
}
