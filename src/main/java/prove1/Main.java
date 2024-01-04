package prove1;

public class Main {
    public static void main(String[] args) {
        HogwartsStudent hogwartsStudent1 = new HogwartsStudent("saka","ali");
        HogwartsStudent hogwartsStudent2 = new HogwartsStudent("anas","faisal");
        HogwartsStudent hogwartsStudent3 = new HogwartsStudent("anas","abdi");
        HogwartsStudent hogwartsStudent4 = new HogwartsStudent("anas","mo");
        HogwartsStudent hogwartsStudent5 = new HogwartsStudent("anas","farax");
        HogwartsStudent hogwartsStudent6 = new HogwartsStudent("anas","halimo");

        hogwartsStudent2.add(hogwartsStudent1);
        hogwartsStudent2.add(hogwartsStudent2);
        hogwartsStudent2.add(hogwartsStudent3);
        hogwartsStudent2.add(hogwartsStudent4);
        hogwartsStudent2.add(hogwartsStudent5);
        hogwartsStudent2.add(hogwartsStudent6);

hogwartsStudent1.setHouse("Slytherin");
hogwartsStudent2.setHouse("KEA");

        System.out.println(hogwartsStudent2.sorterLastName());

        System.out.println(hogwartsStudent1);
        System.out.println(hogwartsStudent2);
    }
}
