package sk.stuba.fei.uim.oop.exam.battletank.domain.vehicle;
import lombok.Data;
import sk.stuba.fei.uim.oop.exam.battletank.domain.enumeration.Nationality;

@Data

public abstract class Tank {
    private static int id;
    private int tankId;
    private String name;
    private Nationality nationality;
    private double price;

    public Tank(String name, Nationality nationality, double price) {
        this.tankId = ++id;
        setName(name);
        setNationality(nationality);
        setPrice(price);
    }

    @Override
    public String toString() {
        return "Tank{" +
                "tankId=" + tankId +
                ", name='" + name + '\'' +
                ", nationality=" + nationality +
                ", price=" + price +
                '}';
    }

    public int getTankId() {
        return tankId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Wrong argument");
        }
        this.name = name;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        if(nationality == null){
            throw new IllegalArgumentException("Wrong argument");
        }
        this.nationality = nationality;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            throw new IllegalArgumentException("Wrong argument");
        }
        this.price = price;
    }
}
