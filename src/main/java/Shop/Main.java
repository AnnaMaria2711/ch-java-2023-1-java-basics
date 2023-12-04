package Shop;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        OrderListRepo orderListRepo = new OrderListRepo();
        ShopService shopService = new ShopService(orderListRepo) ;
        Product product = new Product("Carnegiea gigantea",402789346,233,true);
        Product product2 = new Product("Bread",42364532,1.99,true);
        shopService.newOrder(new Order(34215443, List.of(product)));
        System.out.println("Selected product: " + product + " , " +product2 );
        System.out.println("Gesamtpreis: " + (product.price() + product2.price()) );

        OrderListRepo bestellung = new OrderListRepo();



    }


}
