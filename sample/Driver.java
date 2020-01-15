package sample;

public class Driver {
    public static void main(String[] args) {
        Manager mn = new Manager();
        while (true) {
            int choice = mn.menu();
            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return;
            }
        }
    }
}