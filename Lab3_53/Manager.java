package Lab3_53;

public class Manager {
    Validation vd = new Validation();
    private int[] array;
    private int size;

    public int menu() {
        System.out.println("1.Input Element");
        System.out.println("2.Sort Ascending");
        System.out.println("3.Sort Descending");
        System.out.println("4.Exit");
        System.out.print("Select: ");
        return vd.checkInputIntLimit(1, 4);
    }

    public int inputSize() {
        System.out.print("Enter size of array: ");
        return size = vd.checkInputInt();
    }

    public void inputValueOfArray() {
        size = inputSize();
        array = new int[size];

        System.out.println("Enter array:");
        for (int i = 0; i < size; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = vd.checkInputInt();
        }
    }

    public void sortArrayAscending() {
        int len = array.length;

        if (len == 0)
            System.err.println("List empty");

        for (int i = 0; i < len - 1; i++)
            for (int j = 0; j < len - 1 - i; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

        for (int i = 0; i < len; i++) {
            if (i == array.length - 1) {
                System.out.print("[" + array[i] + "]");
                break;
            }
            System.out.print("[" + array[i] + "] -> ");
        }
        System.out.println();
    }

    public void sortArrayDescending() {
        int len = array.length;

        if (len == 0)
            System.err.println("List empty");

        for (int i = 0; i < len - 1; i++)
            for (int j = 0; j < len - 1 - i; j++)
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

        for (int i = 0; i < len; i++) {
            if (i == array.length - 1) {
                System.out.print("[" + array[i] + "]");
                break;
            }
            System.out.print("[" + array[i] + "] -> ");
        }
        System.out.println();
    }
}