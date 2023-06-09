
public class Сhocolate extends Product {

    private double weight; // объем
    private int calories; // Содержание жирности


    public double getweight() {
        return weight;
    }

    public void setweight(double weight) {
        this.weight = weight;
    }

    public int getcalories() {
        return calories;
    }

    public void setcalories(int calories) {
        this.calories = calories;
    }

    public Сhocolate(String brand, String name, double price, double weight, int calories) {
        super(brand, name, price);
        this.weight = weight;
        this.calories = calories;
    }

    @Override
    public String displayInfo() {
        return String.format("[Плитка] %s - %s - %f [вес: %f; калории: %d]", brand, name, price, weight, calories);
    }
}