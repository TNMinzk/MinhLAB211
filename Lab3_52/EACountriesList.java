package Lab3_52;

import java.util.ArrayList;
import java.util.Collections;

public class EACountriesList {
    private ArrayList<EACountries> lc = new ArrayList<>();
    Validation vd = new Validation();

    public EACountriesList() {
        lc.add(new EACountries("VN", "Vietnam", 331698, "Nice"));
        lc.add(new EACountries("THA", "Thailand", 513120, "Nice"));
    }

    public void inputCountry() {
        System.out.print("Enter country code: ");
        String code = vd.checkInputString();
        if (!vd.checkCountryCodeExist(lc, code)) {
            System.out.println("Country Exist");
        } else {
            System.out.print("Enter country name: ");
            String name = vd.checkInputString();
            if (!vd.checkCountryNameExist(lc, name)) {
                System.out.println("Country Exist");
            } else {
                System.out.print("Enter total area: ");
                double area = vd.checkInputDouble();
                System.out.print("Enter terrain: ");
                String terrain = vd.checkInputString();
                lc.add(new EACountries(code, name, area, terrain));
                System.out.println("Country added");
            }
        }
    }

    public void printCountry() {
        if (lc.isEmpty()) {
            System.out.println("Empty");
            return;
        }
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Area", "Terrain");
        for (EACountries country : lc) {
            country.display();
        }
    }

    public void printCountrySorted() {
        if (lc.isEmpty()) {
            System.out.println("Empty");
            return;
        }
        Collections.sort(lc);
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Area", "Terrain");
        for (EACountries country : lc) {
            country.display();
        }
    }

    public void searchByName() {
        if (lc.isEmpty()) {
            System.out.println("Empty");
            return;
        }
        System.out.print("Enter country name: ");
        String name = vd.checkInputString();
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Area", "Terrain");
        for (EACountries country : lc) {
            if (country.getCountryName().equalsIgnoreCase(name)) country.display();
        }
    }
}
