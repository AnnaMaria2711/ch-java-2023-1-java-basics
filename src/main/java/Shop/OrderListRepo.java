package Shop;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo implements OrderRepo {

    ArrayList<Order> orderList = new ArrayList<Order>();


    @Override
    public Order addOrder(Order order) {
        orderList.add(order);
        return order;
    }
    @Override
    public void removeOrder(Order order) {
        orderList.remove(order);
    }
    @Override
    public Order findOrderByOrderId(int orderId) {
        for (Order order : orderList) {
            if (orderId == order.orderId()) {
                return order;
            }
        }
        throw new RuntimeException("Order with order number " + orderId + " not found.:P");
    }

    @Override
    public List<Order> getAllOrders() {
        return orderList;
    }

}
