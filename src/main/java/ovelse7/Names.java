package ovelse7;

import java.util.ArrayList;

public class Names {
    private String firstName;
    private String middleName;
    private String lastName;

    public Names(String fullName) {
        String[] navne = fullName.split(" ");
        if (navne.length == 3) {
            this.firstName = navne[0].trim();
            this.middleName = navne[1].trim();
            this.lastName = navne[2].trim();
        }
        else {
            this.firstName = navne[0].trim();
            this.lastName = navne[1].trim();
        }

    }



    @Override
    public String toString() {
        if (middleName!=null) {
            return "Names{" +
                    "firstName='" + firstName + '\'' +
                    ", middleName='" + middleName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
        return "Names{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
