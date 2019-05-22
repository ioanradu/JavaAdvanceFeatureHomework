package inheritancePolymorphismAbstraction.exercitiul1;

public class Multime {
    private int[] date;
    private int dim;
    private int n;

    public Multime() {
        int n = 0;
        this.dim = 10; // dimensiunea default al array-ului daca se instantiaza obiectul fara a se declara si dimensiunea array-ului
        this.date = new int[dim];
    }

    public Multime(int dim) {
        this();
        //setez dimensiunea array-ul odata cu instantierea obiectului din metoda main().
        this.dim = dim;
        this.date = new int[dim];
    }

    public void adauga(int number) {
        if (n == dim) {
            System.out.println("Array is full!");
        } else {
            boolean writeOnce = false;
            for (int i = 0; i < date.length; i++) {
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
        boolean find = false;
        for (int i = 0; i < date.length; i++) {
            if (date[i] == number) {
                int index = i; // salvez in variabila index index-ul elementului pe care vreau sa-l sterg din array
                find = true;
                for (i = index; i < date.length - 1; i++) {
                    date[i] = date[i + 1]; // shiftez elementele array-ului spre stanga incepand de la indexul elementului pe care vreau sa-l sterg
                }
            }
        }
        date[date.length - 1] = 0;
        if (find) {
            n--;
        }
    }

    public void afisare() {
        for (int i = 0; i < date.length; i++) {
            System.out.printf("%2d ", date[i]);
        }
        System.out.println();
    }
}