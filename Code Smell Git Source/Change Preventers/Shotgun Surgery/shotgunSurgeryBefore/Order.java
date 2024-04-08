package shotgunSurgeryBefore;

public class Order { 
	  
    private String customerName; 
    private List<OrderItem> items; 
    private Address shippingAddress;  

    public void calculateTotal() { 
        double total = 0; 
        for (OrderItem orderItem : items) { 
            total += orderItem.getPrice() * orderItem.getQuantity(); 
        } 
        this.total = total; 
    }   

    public void printOrder() { 
        System.out.println("Customer Name: " + customerName); 
        
        for (OrderItem orderItem : items) { 
            System.out.println("Item Name: " + orderItem.getName()); 
            System.out.println("Item Quantity: " + orderItem.getQuantity()); 
        } 
        
        System.out.println("Shipping Address: " + shippingAddress.toString()); 
        System.out.println("Total: " + total); 
    } 
} 
