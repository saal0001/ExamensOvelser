package ovelse8;

public class Main {
    public static void main(String[] args) {

        DateAgeCalculator dateAgeCalculator= new DateAgeCalculator(21,20);

        dateAgeCalculator.ageCalculate();

        System.out.println(dateAgeCalculator.dateAcceptable());
    }
}
