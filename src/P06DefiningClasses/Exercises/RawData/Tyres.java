package P06DefiningClasses.Exercises.RawData;

public class Tyres {
    private int tyreOneAge;
    private int tyreTwoAge;
    private int tyreThreeAge;
    private int tyreFourAge;

    private double tyreOnePressure;
    private double tyreTwoPressure;
    private double tyreThreePressure;
    private double tyreFourPressure;

    public Tyres(int tyreOneAge, int tyreTwoAge, int tyreThreeAge, int tyreFourAge, double tyreOnePressure,
                 double tyreTwoPressure, double tyreThreePressure, double tyreFourPressure) {
        this.tyreOneAge = tyreOneAge;
        this.tyreTwoAge = tyreTwoAge;
        this.tyreThreeAge = tyreThreeAge;
        this.tyreFourAge = tyreFourAge;
        this.tyreOnePressure = tyreOnePressure;
        this.tyreTwoPressure = tyreTwoPressure;
        this.tyreThreePressure = tyreThreePressure;
        this.tyreFourPressure = tyreFourPressure;
    }

    public int getTyreOneAge() {
        return tyreOneAge;
    }

    public int getTyreTwoAge() {
        return tyreTwoAge;
    }

    public int getTyreThreeAge() {
        return tyreThreeAge;
    }

    public int getTyreFourAge() {
        return tyreFourAge;
    }

    public double getTyreOnePressure() {
        return tyreOnePressure;
    }

    public double getTyreTwoPressure() {
        return tyreTwoPressure;
    }

    public double getTyreThreePressure() {
        return tyreThreePressure;
    }

    public double getTyreFourPressure() {
        return tyreFourPressure;
    }
}
