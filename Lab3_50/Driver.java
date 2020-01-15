package Lab3_50;

public class Driver {
    public static void main(String[] args) {
        Manager mn = new Manager();
        while (true) {
            int choice = mn.menu();
            switch (choice) {
                case 1:
                    mn.superlativeEquation();
                    break;
                case 2:
                    mn.quadraticEquation();
                    break;
                case 3:
                    return;
            }
        }
    }
}