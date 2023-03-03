public class Bus extends Auto {
    private int fare;
    private int maxNumberOfPassengers;

    public Bus(String model, int yearOfIssue, String countryOfIssue, int enginePower, int fare, int maxNumberOfPassengers) {
        super(model, yearOfIssue, countryOfIssue, enginePower);
        this.fare = fare;
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    public int getFare() {
        return fare;
    }

    public int getMaxNumberOfPassengers() {
        return maxNumberOfPassengers;
    }

    @Override
    public String toString() {
        return "Автобус: \n Модель: " + getModel() + ", год выпуска: " + getYearOfIssue() +
                ", страна выпуска: " + getCountryOfIssue() + ", мощность двигателя: "
                + getEnginePower() + " л.с., оплата за проезд: " + fare +
                "р., максимальное количество пассажиров: " + maxNumberOfPassengers;
    }
}