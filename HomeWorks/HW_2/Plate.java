package HW_2;

public class Plate implements Nutrition {
    private int food;

    public int getFood() {
        return food;
    }
    
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("plate: " + food);
        
    }

    public void reduceFood(int n) {
        food = food -n;
    }
    public void addFood(int x) {
        food =food + x;
    }
    
}