public class OrderClass {
    private int orderID;
    private int NoOfItems;
    private UserClass customer;
    private String MenuItem;
    private String[] myorder;
    private boolean OrderStatus;

    OrderClass(int numberitems){
        NoOfItems = numberitems;
        myorder = new String[NoOfItems];

    }

    public void addItem(String item){
        for (int s =0; s < myorder.length; s++){
            if (myorder[s] == null){
                myorder[s]=item;
                break;
            }
        }
    }

    public void removeItem(String item){
        for (int s =0; s < myorder.length; s++){
            if (myorder[s] == item){
                myorder[s]=null;
                break;
            }
        }
    }

    public void updateStatus(boolean status){
        OrderStatus=status;
    }

    public  void delivery(){
        if (OrderStatus){
            System.out.println("Your Food is Been Delivered");
        }
        else{
            System.out.println("Please Wait As We Process YOur Order");
        }  
    }
}
