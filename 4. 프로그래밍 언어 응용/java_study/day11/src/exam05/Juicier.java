package exam05;

import java.util.List;

public class Juicier {
    public static void make(Basket<? extends Fruit> basket){
        List<?> items = basket.getItems();
        System.out.println(items);
    }


}
