public class UserClass {

    private String userID;
    private String userName;
    private String email;
    private String phoneNumber;

    public UserClass(String userName, String email, String phoneNumber, String userID) {
        this.userName = userName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userID = userID;
    }

    public String getUserID(){
        return userID;
    }
    public String getname(){
        return userName;
    }

    public String getemail(){
        return email;
    }

    
}   

    
    
