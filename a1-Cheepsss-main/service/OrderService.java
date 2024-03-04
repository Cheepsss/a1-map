package service;

import Domain.Order;
import Domain.Cake;
import repository.OrderRepo;

import java.util.ArrayList;

public class OrderService {
    private OrderRepo orderRepo;

    public OrderService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public void createOrder(int nrCakes, int nrOrder, double totalPrice, Cake[] cakes) {
        Order newOrder = new Order(nrCakes, nrOrder, totalPrice, cakes);
        orderRepo.addOrder(newOrder);
    }

    public ArrayList<Order> getAllOrders() {
        return orderRepo.getAll();
    }

    public void updateOrder(int nr, Order newOrder) {
        orderRepo.updateOrder(nr, newOrder);
    }

    public void deleteOrder(int nro) {
        orderRepo.deleteOrder(nro);
    }

    public void deleteOrderAtIndex(int index) {
        orderRepo.deleteOrderIndex(index);
    }
    public void updateOrderAtIndex(int index, Order newOrder){
        orderRepo.updateOrderIndex(index, newOrder);
    }
}
