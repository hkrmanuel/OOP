public class FoodDelivery{
    private int noOfOrders;
    private static OrderClass[] orderlist;
    public static UserClass[] users= new UserClass[10];

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
        for (int i = 0; i < users.length; i++){
            users[i] = account;
            break;
        }
        return true;
    }
}