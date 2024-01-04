package ovelse9;

import java.util.ArrayList;

public class Motherboard {
    private SataDrive sataDrive1;
    private SataDrive sataDrive2;
    private SataDrive sataDrive3;
    private SataDrive sataDrive4;
    private ArrayList<Motherboard> motherboardList = new ArrayList<>();

    public Motherboard(SataDrive sataDrive1) {
        this.sataDrive1 = sataDrive1;
    }

    public Motherboard(SataDrive sataDrive1, SataDrive sataDrive2) {
        this.sataDrive1 = sataDrive1;
        this.sataDrive2 = sataDrive2;
    }

    public Motherboard(SataDrive sataDrive1, SataDrive sataDrive2, SataDrive sataDrive3) {
        this.sataDrive1 = sataDrive1;
        this.sataDrive2 = sataDrive2;
        this.sataDrive3 = sataDrive3;

    }

    public Motherboard(SataDrive sataDrive1, SataDrive sataDrive2, SataDrive sataDrive3, SataDrive sataDrive4) {
        this.sataDrive1 = sataDrive1;
        this.sataDrive2 = sataDrive2;
        this.sataDrive3 = sataDrive3;
        this.sataDrive4 = sataDrive4;
    }


    public void add(Motherboard motherboard) {
        motherboardList.add(motherboard);
    }

    public ArrayList udskriv() {
        return motherboardList;
    }

    public void plads(SataDrive sataDrive){

        if (motherboardList.size()<=4){
            for (int i = 0; i < motherboardList.size(); i++) {
                motherboardList.get(i).equals(sataDrive);
            }
        }
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "sataDrive1=" + sataDrive1 +
                ", sataDrive2=" + sataDrive2 +
                ", sataDrive3=" + sataDrive3 +
                ", sataDrive4=" + sataDrive4 +
                '}';
    }
}
