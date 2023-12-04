package Shop;

import org.example.klassenundobjekte.Auto;

import java.util.List;

public class ShopService  {

    private OrderRepo orderRepo;
    ShopService(OrderRepo orderRepo){
        this.orderRepo = orderRepo;
    }

    ProductRepo productRepo = new ProductRepo();

    public Order newOrder(Order order) {
        if(checkIfProductsExist(order.products())) {
            return orderRepo.addOrder(order);
        }else {
            System.out.println("Produkte existieren nicht.");
            throw new RuntimeException("Products not found.");
        }
    }

    private boolean checkIfProductsExist(List<Product> products) {
        for (Product product : products) {
            if (!productRepo.productsList.contains(product)) {
                return false;

            }
        }
        return true;
    }

}
