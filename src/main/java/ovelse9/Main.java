package ovelse9;

public class Main {
    public static void main(String[] args) {


        SataDrive sataDrive1 = new SataDrive("bill");
        SataDrive sataDrive2 = new SataDrive("ab");
        SataDrive sataDrive3 = new SataDrive("hdmi");
        SataDrive sataDrive4 = new SataDrive("cb");
        Motherboard motherboard = new Motherboard(sataDrive1, sataDrive2);
        motherboard.add(motherboard);
        System.out.println(motherboard.udskriv());
    }
}
