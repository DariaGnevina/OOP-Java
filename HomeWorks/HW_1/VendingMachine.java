import java.util.List;

public class VendingMachine {

    private final List<Product> products;



    public VendingMachine(List<Product> products) {

        this.products = products;
    }

    public  BottleOfWater getBottleOfWater(double volume){

        for(Product product : products){
            if (product instanceof BottleOfWater){
               if ( ((BottleOfWater)product).getVolume()  == volume){
                   return (BottleOfWater)product;
               }
            }
        }
        return null;
    }
    
    public  Сhocolate getChocolateCalories(int сalories){

        for(Product product : products){
            if (product instanceof Сhocolate){
               if ( ((Сhocolate)product).getcalories()  == сalories){
                   return (Сhocolate)product;
               }
            }
        }
        return null;
    }

    

}