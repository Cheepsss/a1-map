package UI;
import java.util.Objects;
import java.util.Scanner;
import Domain.Cake;
import Domain.Order;
import repository.OrderRepo;
import service.OrderService;

import java.util.ArrayList;

public class Ui {
    static void printMenu(){
        System.out.println("choose option:");
        System.out.println("1.show all data");
        System.out.println("2.delete by index");
        System.out.println("3.update by nr of order");
        System.out.println("4.delete by nr of order");
        System.out.println("5. add order");
    }
    public static void main(String[] args) {
        OrderRepo orderRepo = new OrderRepo();
        OrderService orderService = new OrderService(orderRepo);

        Cake[] cakes1 = {new Cake(20, "Chocolate", "Flour, Sugar, Cocoa"), new Cake(15, "Vanilla", "Flour, Sugar, Vanilla")};
        orderService.createOrder(2, 101, 35.0, cakes1);

        Cake[] cakes2 = {new Cake(25, "Red Velvet", "Flour, Sugar, Cocoa, Food Coloring"), new Cake(18, "Strawberry", "Flour, Sugar, Strawberry")};
        orderService.createOrder(2, 102, 43.0, cakes2);

        Cake[] cakes3 = {new Cake(30, "Cheesecake", "Cream Cheese, Sugar, Graham Cracker Crust"), new Cake(22, "Carrot Cake", "Flour, Sugar, Carrot")};
        orderService.createOrder(2, 103, 52.0, cakes3);

        Cake[] cakes4 = {new Cake(28, "Lemon", "Flour, Sugar, Lemon Zest"), new Cake(20, "Coconut", "Flour, Sugar, Coconut Milk")};
        orderService.createOrder(2, 104, 48.0, cakes4);

        Cake[] cakes5 = {new Cake(22, "Le pupu cake", "Flour, Sugar, Coffee"), new Cake(18, "Pumpkin", "Flour, Sugar, Pumpkin Puree"),new Cake(22, "Le pupu cake", "Flour, Sugar, Coffee"), new Cake(18, "Pumpkin", "Flour, Sugar, Pumpkin Puree")};
        orderService.createOrder(2, 105, 40.0, cakes5);


        System.out.println("Nr of orders: " + orderService.getAllOrders().size());
        orderService.deleteOrderAtIndex(0);
        orderService.deleteOrder(102);

        ArrayList<Order> allOrders = orderService.getAllOrders();
        System.out.println("All Orders before update: " + allOrders);
        for (Order o : allOrders){
            System.out.println(o);
        }

        orderService.updateOrder(104,new Order(2, 999, 43.0, cakes2));
        orderService.updateOrderAtIndex(0, new Order(2, 107, 40.0, cakes5) );
        System.out.println("Nr of orders after delete: " + orderService.getAllOrders().size());

        allOrders = orderService.getAllOrders();
        System.out.println("All Orders in memory after update: " + allOrders);
        for (Order o : allOrders){
            System.out.println(o);
        }
        String s;
        Scanner in = new Scanner(System.in);
        Cake test[]={};
        String nrc;
        String nro;
        String price;
        while(true){
            printMenu();
            s = in.nextLine();
            if(Objects.equals(s, "1")){
                for (Order o : allOrders){
                    System.out.println(o);
                }
            }
            if(Objects.equals(s, "2")){
                s = in.nextLine();
                orderService.deleteOrderAtIndex(Integer.parseInt(s));
            }
            if(Objects.equals(s, "3")){
                System.out.println("nr cakes:");
                nrc = in.nextLine();
                System.out.println("nr order:");
                nro = in.nextLine();
                System.out.println("price:");
                price = in.nextLine();
                orderService.updateOrder(Integer.parseInt(nro),new Order(Integer.parseInt(nrc),Integer.parseInt(nro),Double.parseDouble(price),test));
            }
            if(Objects.equals(s, "4")){
                System.out.println("nr order:");
                nro = in.nextLine();

                orderService.deleteOrder(Integer.parseInt(nro));
            }
            if(Objects.equals(s, "5")){
                System.out.println("nr cakes:");
                nrc = in.nextLine();
                System.out.println("nr order:");
                nro = in.nextLine();
                System.out.println("price:");
                price = in.nextLine();
                orderService.createOrder(Integer.parseInt(nrc),Integer.parseInt(nro),Double.parseDouble(price),test);
            }


        }

    }
}