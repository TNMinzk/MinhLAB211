package Lab3_52;

public class Driver {
    public static void main(String[] args) {
        Manager mn = new Manager();
        EACountriesList l = new EACountriesList();

        while (true) {
            int choice = mn.menu();
            switch (choice) {
                case 1:
                    l.inputCountry();
                    break;
                case 2:
                    l.printCountry();
                    break;
                case 3:
                    l.searchByName();
                    break;
                case 4:
                    l.printCountrySorted();
                    break;
                case 5:
                    return;
            }
        }
    }
}