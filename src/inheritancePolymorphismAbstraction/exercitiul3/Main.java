package inheritancePolymorphismAbstraction.exercitiul3;

public class Main {
    public static void main(String[] args) {
        Walker walker = new Walker();
        Swimmer swimmer = new Swimmer();

        walker.walk();
        walker.breath();
        swimmer.swim();
        swimmer.breath();
    }


}
