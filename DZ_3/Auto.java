

public abstract class Auto extends Transport{
    private int enginePower;

    public Auto(String model, int yearOfIssue, String countryOfIssue, int enginePower) {
        super(model, yearOfIssue, countryOfIssue);
        this.enginePower = enginePower;
    }

    public int getEnginePower() {
        return enginePower;
    }

}