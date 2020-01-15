package Lab3_52;

public class EACountries extends Country implements Comparable<EACountries> {

    private String countryTerrain;

    public EACountries() {
    }

    public EACountries(String countryCode, String countryName, double countryArea, String countryTerrain) {
        super(countryCode, countryName, countryArea);
        this.countryTerrain = countryTerrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    @Override
    public int compareTo(EACountries o) {
        return this.getCountryName().compareTo(o.getCountryName());
    }

    public void display() {
        System.out.printf("%-10s%-25s%-20.0f%-25s\n", this.countryCode, this.countryName, this.countryArea, this.countryTerrain);
    }
}
