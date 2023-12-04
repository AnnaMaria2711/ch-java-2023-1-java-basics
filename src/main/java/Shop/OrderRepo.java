package Shop;

import java.util.List;

public interface OrderRepo {

    Order addOrder(Order order);

    void removeOrder(Order order);

    Order findOrderByOrderId(int orderId);

    List<Order> getAllOrders();
}


