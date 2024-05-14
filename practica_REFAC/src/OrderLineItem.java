// REFACT extraccion de clase
public class OrderLineItem {
    private String productName;
    private int quantity;
    private double price;

    public OrderLineItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    public double getPrice() {
        return price * quantity;
    }

//    refat -> metodo para mostrar los objetos de esta clase en la order
    @Override
    public String toString() {
        return "productName: " + productName +
                "\nquantity: " + quantity +
                "\nprice: " + getPrice();
    }
}
