package ovelse8;

public class DateAgeCalculator {
    private int youAge;
    private int dateAge;

    public DateAgeCalculator(int youAge, int dateAge) {
        this.dateAge = dateAge;
        this.youAge = youAge;
    }

    public int ageCalculate() {
        int lowest = 0;
        lowest = youAge / 2 + 7;
        return lowest;
    }

    public boolean dateAcceptable() {
        if (dateAge > ageCalculate()) {
            return true;
        }
        return false;
    }

}
