package HW_2;

public class Cat implements Nutrition {
    public String name;
    private int appetite;
    private boolean state;

    public boolean getState() {
        return state;
    }

    public void setState(boolean state){
        this.state = state;

    }

    public int getAppetite() {
        return appetite;
    }

    


    public Cat(String name, int appetite, boolean state) {
        this.name = name;
        this.appetite = appetite;
        this.state = state;
    }
    
    public void eat(Plate p) {
        p.reduceFood(appetite);
    }
}