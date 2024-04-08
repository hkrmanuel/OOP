public class FoodDelivery{
    private int noOfOrders;
    private static OrderClass[] orderlist;

    public static UserClass users;


    FoodDelivery(){
    
    }

    FoodDelivery(int n){
        noOfOrders = n;
        orderlist = new OrderClass[noOfOrders];
    
    }


    public void addOrder(OrderClass order){
        for (int i = 0; i < orderlist.length; i++){
            if (orderlist[i] == null) {
                orderlist[i] = order;
                break;
            }

        }
    }

    public void removeOrder(OrderClass order){
        for (int i = 0; i < orderlist.length; i++) {
            if (orderlist[i] == order) {
                orderlist[i] = null;
                break;
            }
        }
    }

    public boolean addAccount(UserClass account){
        users = account;
        return true;
    }
}