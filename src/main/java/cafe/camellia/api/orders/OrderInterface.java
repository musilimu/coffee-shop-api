package cafe.camellia.api.orders;

import java.util.List;

public interface OrderInterface {
    public Order createOrder(Order order);
    public Order updateOrder(Order order);
    public Order deleteOrder(String id);
    public Order getOrder(String id);
    public List<Order> getOrders();
}
