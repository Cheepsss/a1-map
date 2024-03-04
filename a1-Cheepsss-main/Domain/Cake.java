package Domain;

public class Cake {
    private int price;
    private String type, ingredients;

    public Cake(int price, String type, String ingredients) {
        this.price = price;
        this.type = type;
        this.ingredients = ingredients;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "price=" + price +
                ", type='" + type + '\'' +
                ", ingredients='" + ingredients + '\'' +
                '}';
    }
}
