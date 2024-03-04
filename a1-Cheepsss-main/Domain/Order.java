package Domain;
import Domain.Cake;

import java.util.Arrays;

public class Order {

    private int nrCakes, nrOrder;
    private double totalPrice;
    private Cake[] cakes;


    public int getNrCakes() {
        return nrCakes;
    }

    public void setNrCakes(int nrCakes) {
        this.nrCakes = nrCakes;
    }

    public int getNrOrder() {
        return nrOrder;
    }

    public void setNrOrder(int nrOrder) {
        this.nrOrder = nrOrder;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Cake[] getCakes() {
        return cakes;
    }

    public void setCakes(Cake[] cakes) {
        this.cakes = cakes;
    }
    public Order(int nrCakes, int nrOrder, double totalPrice, Cake[] cakes) {
        this.nrCakes = nrCakes;
        this.nrOrder = nrOrder;
        this.totalPrice = totalPrice;
        this.cakes = cakes;
    }


    @Override
    public String toString() {
        return "Order{" +
                "nrCakes=" + nrCakes +
                ", nrOrder=" + nrOrder +
                ", totalPrice=" + totalPrice +
                ", cakes=" + Arrays.toString(cakes) +
                '}';
    }
}
