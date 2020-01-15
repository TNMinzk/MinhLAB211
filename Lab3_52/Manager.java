package Lab3_52;

public class Manager {
    Validation vd = new Validation();

    public int menu() {
        System.out.println("1.Add a country");
        System.out.println("2.Display the information of the country you've just input");
        System.out.println("3.Search the information of country by user-entered name");
        System.out.println("4.Display the information of countries sorted name in ascending order");
        System.out.println("5.Exit");
        return vd.checkInputIntLimit(1, 5);
    }
}