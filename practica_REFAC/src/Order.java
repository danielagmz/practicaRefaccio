import java.util.List;
// REFACT
public class Order {
    private static List<OrderLineItem> lineItems;
    private double taxRate;

    public Order(List<OrderLineItem> lineItems, double taxRate) {
        this.lineItems = lineItems;
        this.taxRate = taxRate;
    }

    public double calculateTotalPrice() {
        double subtotal = 0.0;
        for (OrderLineItem item : lineItems) {
            subtotal += item.getPrice();
        }
        double tax = subtotal * taxRate;
        return subtotal + tax;
    }

    @Override
    public String toString() {
        return "-----------Order---------" +
                "\n"+lineItemToString()+
                "taxRate: " + taxRate+
                "\nTotalPrice "+calculateTotalPrice();
    }

    private String lineItemToString(){
        StringBuilder lineElem= new StringBuilder();

        for (OrderLineItem lineItem : lineItems) {
            lineElem.append(lineItem.toString()).append("\n");
        }
        return lineElem.toString();
    }
}
