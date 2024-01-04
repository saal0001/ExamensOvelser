package ovelse9;

public class SataDrive {
    private String name;

    public SataDrive(String name){
        this.name=name;
    }
public String getName(){
        return name;
}
    @Override
    public String toString() {
        return "SataDrive{" +
                "name='" + name + '\'' +
                '}';
    }
}
