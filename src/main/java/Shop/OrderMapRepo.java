package Shop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderMapRepo implements OrderRepo{

    private Map<Integer, Order> orderMap = new HashMap<>();


    @Override
    public Order addOrder(Order order) {
    orderMap.put(order.orderId(), order);
    return order;
    }

    @Override
    public void removeOrder(Order order) {
    orderMap.remove(order.orderId());
    }

    @Override
    public Order findOrderByOrderId(int orderId) {
        return orderMap.get(orderId);
    }


    @Override
    public List<Order> getAllOrders() {
        return orderMap.values().stream().toList();

    }


}
