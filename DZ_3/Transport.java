

public abstract class Transport {
    private String model;
    private int yearOfIssue;
    private String countryOfIssue;


    public Transport(String model, int yearOfIssue, String countryOfIssue) {
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.countryOfIssue = countryOfIssue;
    }

    public String getModel() {
        return model;
    }


    public int getYearOfIssue() {
        return yearOfIssue;
    }


    public String getCountryOfIssue() {
        return countryOfIssue;
    }

}