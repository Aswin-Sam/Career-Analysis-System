public class User{
    private String userName;
    private String password;
    private int phoneNumber;
    private String email;

    public User(String userName,String password,int phoneNumber,String email)
    {
        this.userName=userName;
        this.password=password;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }
    //Set
    // public void setUserName(String userName)
    // {
    //     this.userName=userName;
    // }

    public void setPassword(String password)
    {
        this.password=password;
    }

    public void setphone_number(int phone_number)
    {
        this.phoneNumber=phone_number;
    }

    public void setEmail(String email)
    {
        this.email=email;
    }
    // Get
    public String getUserName()
    {
        return this.userName;
    }
    public String getPassword()
    {
        return this.password;
    }
    public int getPhone_number()
    {
        return this.phoneNumber;
    }
    public String getEmail()
    {
        return this.email;
    }
}