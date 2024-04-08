package divergentChangeAfter;

public class Order { 
	
    private String customerName; 
    private List<OrderItem> items; 
  
    public void addOrderItem(String itemName, int quantity) { 
        // Menambahkan item baru ke daftar items 
        OrderItem item = new OrderItem(itemName, quantity); 
        items.add(item); 
        // Menghitung ulang total harga 
        calculateTotal(); 
    } 

    public void cancelOrderItem(String itemName) { 
        // Mencari item yang ingin dibatalkan 
        OrderItem itemToRemove = null; 
        for (OrderItem orderItem : items) { 
            if (orderItem.getItemName().equals(itemName)) { 
                itemToRemove = orderItem; 
                break; 
            } 
        } 

        // Menghapus item dari daftar items 
        if (itemToRemove != null) { 
            items.remove(itemToRemove); 
            // Menghitung ulang total harga 
            calculateTotal(); 
        } 
    } 

    private void calculateTotal() { 
        double total = 0; 
        for (OrderItem orderItem : items) { 
            total += orderItem.getPrice() * orderItem.getQuantity(); 
        } 
        this.total = total; 
    } 
} 