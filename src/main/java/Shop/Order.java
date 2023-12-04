package Shop;

import java.util.List;

public record Order(int orderId, List<Product> products) {
}
