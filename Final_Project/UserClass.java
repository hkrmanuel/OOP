// Class representing a user in the system
public class UserClass {

    private String userID; // User ID
    private String userName; // User name
    private String phoneNumber; // User phone number

    // Constructor to initialize user properties
    public UserClass(String userName, String phoneNumber, String userID) {
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.userID = userID;
    }

    // Getter method to retrieve user ID
    public String getUserID(){
        return userID;
    }

    // Getter method to retrieve user name
    public String getname(){
        return userName;
    }

    // Override toString method to customize string representation of the user object
    @Override
    public String toString(){
        // Return user information as a formatted string
        return "User ID : " + userID + "\n" + "Username : " + userName + "\n";
    }   
}  
