package prove1;

import java.util.Comparator;

public class Sort implements Comparator<HogwartsStudent> {

    public int compare(HogwartsStudent lastName1, HogwartsStudent lastName2){
        return lastName1.getLastName().compareTo(lastName2.getLastName());
    }


}
