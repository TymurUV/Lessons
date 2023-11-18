package integerHW;

public class Car {
    int numbHorsePower;
    int yearOfProduction;

    public Car(int numbHorsePower, int yearOfProduction) {
        this.numbHorsePower = numbHorsePower;
        this.yearOfProduction = yearOfProduction;
    }

    public int getNumbHorsePower() {
        return numbHorsePower;
    }

    public void setNumbHorsePower(int numbHorsePower) {
        this.numbHorsePower = numbHorsePower;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numbHorsePower=" + numbHorsePower +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
