package Models;

public class User {

    private final int UserId;
    private final String FirstName;
    private final String LastName;

    public  User (int UserId, String FirstName, String LastName){
        this.UserId= UserId;
        this.FirstName = FirstName;
        this.LastName = LastName;

    }
    public int getId(){
        return UserId;
    }
    public String getName(){
        return FirstName;
    }
    public String getLastName(){
        return LastName;
    }
}
