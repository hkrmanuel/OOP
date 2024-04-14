// Class representing a Food Delivery system
public class FoodDelivery{
    private int noOfOrders; // Number of orders
    private static OrderClass[] orderlist; // Array to store orders

    public static UserClass users; // Static variable to store user information

    // Default constructor
    FoodDelivery(){
    
    }

    // Parameterized constructor
    FoodDelivery(int n){
        noOfOrders = n;
        orderlist = new OrderClass[noOfOrders]; // Initialize order list with given number of orders
    
    }

    // Method to add an order to the order list
    public void addOrder(OrderClass order){
        for (int i = 0; i < orderlist.length; i++){
            if (orderlist[i] == null) {
                orderlist[i] = order; // Add order to the first available slot
                break;
            }
        }
    }

    // Method to remove an order from the order list
    public void removeOrder(OrderClass order){
        for (int i = 0; i < orderlist.length; i++) {
            if (orderlist[i] == order) {
                orderlist[i] = null; // Remove order by setting the slot to null
                break;
            }
        }
    }

    // Method to add a user account
    public boolean addAccount(UserClass account){
        users = account; // Set the user account
        return true;
    }
}
