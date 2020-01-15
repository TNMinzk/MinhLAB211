package Lab3_53;

public class Driver {
    public static void main(String[] args) {
        Manager mn = new Manager();
        while (true) {
            int choice = mn.menu();
            switch (choice) {
                case 1:
                    mn.inputValueOfArray();
                    break;
                case 2:
                    mn.sortArrayAscending();
                    break;
                case 3:
                    mn.sortArrayDescending();
                    break;
                case 4:
                    return;
            }
        }
    }
}