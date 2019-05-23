package inheritancePolymorphismAbstraction.exercitiul1;

public class Multime {
    private int[] date;
    private int dim;
    private int n;

    public Multime() {
        int n = 0;
        this.dim = 10; // dimensiunea default al array-ului
        this.date = new int[dim];
    }

    public Multime(int dim) {
        //setez dimensiunea array-ul odata cu instantierea obiectului din metoda main().
        this.dim = dim;
        this.date = new int[dim];
        int n = 0;
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
        int index = 0;
        boolean find = false;
        for (int i = 0; i < date.length; i++) {
            if (date[i] == number) {
                index = i;
                find = true;
                break;
            }
        }
        if (find) {
            while (index < n && index <= date.length - 2) {// conditia index <= date.length - 2 trebuie pusa pentru ca arunca exceptia ArrayIndexOutOfBoundsException daca dimensiunea tabloului e mai mica de 4 si se incearca a se face o extragere a unui element
                date[index] = date[index + 1];
                index++;
            }
            date[date.length - 1] = 0; // dupa ce facem shiftarea spre stanga, in cazul in care toate elementele array-ului au valori, ultimul element va ramane cu  valoarea initiala
            n--;
        }

        // Varianta fara n
        /* if (find) {
            while (index < date.length - 1) {
                date[index] = date[index + 1];
                index++;
            }
            date[date.length - 1] = 0;
        }*/
    }

    public void afisare() {
        for (int i = 0; i < date.length; i++) {
            System.out.printf("%2d ", date[i]);
        }
        System.out.println();
    }
}