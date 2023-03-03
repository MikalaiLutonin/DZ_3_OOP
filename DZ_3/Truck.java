public class Truck extends Auto{
    private int capacity;

    public Truck(String model, int yearOfIssue, String countryOfIssue, int enginePower, int capacity) {
        super(model, yearOfIssue, countryOfIssue, enginePower);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Грузовик: \n Модель: " + getModel() + ", год выпуска: " + getYearOfIssue() +
                ", страна выпуска: " + getCountryOfIssue() + ", мощность двигателя: "
                + getEnginePower() + " л.с., вместимость: " + capacity + "т.";
    }
}