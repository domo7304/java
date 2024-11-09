package class1.ex2;

public class ProductOrder {
    private final String productName;
    private final Integer price;
    private final Integer quantity;

    public ProductOrder(String productName, Integer price, Integer quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return this.productName;
    }

    public Integer getPrice() {
        return this.price;
    }

    public Integer getQuantity() {
        return this.quantity;
    }
}
