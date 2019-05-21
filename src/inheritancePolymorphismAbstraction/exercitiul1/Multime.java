package inheritancePolymorphismAbstraction.exercitiul1;

public class Multime {
    private int[] date;
    private int dim;
    private int n;

    public Multime() {
        int n = 0;
    }

    public Multime(int dim) {
        this();
        //setez dimensiunea array-ul odata cu instantierea obiectului din metoda Main().
        this.dim = dim;
        this.date = new int[dim];
    }

    public void adauga(int number) {
        if (n == dim) {
            System.out.println("Array is full!");
        } else {
            boolean writeOnce = false;
            for (int i = 0; i < dim; i++) {
                if (date[i] == number) {
                    break;
                } else if (!writeOnce && date[i] == 0) {
                    date[i] = number;
                    n++;
                    writeOnce = true;
                }
            }
        }
    }

    public void extrage(int number) {
        for (int i = 0; i < date.length; i++) {
            if (date[i] != number) {
                continue;
            } else {
                date[i] = 0;
                n--;
            }
        }
    }

    public void afisare() {
        for (int i = 0; i < date.length; i++) {
            System.out.print(date[i] + " ");
        }
        System.out.println();
    }
}