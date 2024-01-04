package prove1;

import java.util.ArrayList;
import java.util.Collections;

public class HogwartsStudent {
    private String firstName;
    private String lastName;
    private String house;
private ArrayList<HogwartsStudent> hogwartsStudents = new ArrayList<>();
    public HogwartsStudent( String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void add(HogwartsStudent hogwartsStudent){
        hogwartsStudents.add(hogwartsStudent);
    }

    public String getLastName() {
        return lastName;
    }

    public void setHouse(String house) {
        String[] houses = {"Griffindor", "Hufflepuff", "Ravenclaw", "Slytherin"};
        try {
            for (String houses1 : houses) {
                if (house.equals(houses1)) {
                    this.house = house;
                }
            }
        } catch (Exception e) {
            System.out.println("this house does not exist");
        }

    }

public ArrayList<HogwartsStudent> sorterLastName(){

    Collections.sort(hogwartsStudents,new Sort());
    return hogwartsStudents;
}



    @Override
    public String toString() {
        return "HogwartsStudent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", house='" + house + '\'' +
                '}';
    }
}
