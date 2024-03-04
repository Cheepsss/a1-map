package repository;
import Domain.Order;
import java.util.ArrayList;

public class OrderRepo {
    private ArrayList<Order> orders = new ArrayList<Order>();
    public void addOrder(Order o)
    {
        orders.add(o);
    }

    public ArrayList<Order> getAll()
    {
        return this.orders;
    }

    public void updateOrder(int nr, Order newO){
        for (Order or : orders){
            if(or.getNrOrder() == nr){
                int index = orders.indexOf(or);
                orders.set(index,newO);
            }
        }
    }
    public void updateOrderIndex(int index, Order newO){
        orders.set(index, newO);
    }

    public void deleteOrder(int nro){
        orders.removeIf(or -> or.getNrOrder() == nro);
    }

    public void deleteOrderIndex(int index){
        orders.remove(index);
    }

}
