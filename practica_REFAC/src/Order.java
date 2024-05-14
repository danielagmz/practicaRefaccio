import java.util.List;
// REFACT extraccion de clase
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
// refact -> toString() para mostrar los objetos que se creen de esta clase
    @Override
    public String toString() {
        return "-----------Order---------" +
                "\n"+lineItemToString()+
                "taxRate: " + taxRate+
                "\nTotalPrice "+calculateTotalPrice();
    }
// refact -> metodo para que se puedan mostrar los objetos del lineItem uno debajo del otro en la order
    private String lineItemToString(){
        StringBuilder lineElem= new StringBuilder();

        for (OrderLineItem lineItem : lineItems) {
            lineElem.append(lineItem.toString()).append("\n");
        }
        return lineElem.toString();
    }
}
