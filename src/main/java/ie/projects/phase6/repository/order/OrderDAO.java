package ie.projects.phase6.repository.order;

public class OrderDAO {
    int cartId;
    String foodName;
    int foodNum;
    float price;

    public OrderDAO(int cartId, String foodName, int foodNum, float price){
        this.cartId = cartId;
        this.foodName = foodName;
        this.foodNum = foodNum;
        this.price = price;
    }

    public int getCartId() {
        return cartId;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getFoodNum() {
        return foodNum;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
