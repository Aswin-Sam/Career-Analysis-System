import java.util.*;
public class EngineeringCollege {

    private String userName;
    private String password;
    private String collegeName;
    // private String collegeType;
    private int courseCount;
    private LinkedHashMap<String,Float>courseDetails=new LinkedHashMap<>();
    private String address;
    private int phoneNumber;
    
    //SET
    public void setUserName(String userName)
    {
        this.userName=userName;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }
    public void setcollegeName(String collegeName)
    {
        this.collegeName=collegeName;
    }
    // public void setCollegeType(String collegeType)
    // {
    //     this.collegeType=collegeType;
    // }
    public void setCourseCounr(int courseCount)
    {
        this.courseCount=courseCount;
    }
    public void setCourseDetails(String coursecollegeName,float cuttOff)
    {
        courseDetails.put(coursecollegeName,cuttOff);
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setPhoneNumber(int phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
    // GET
    public String getUserName()
    {
        return this.userName;
    }
    public String getPassword()
    {
        return this.password;
    }
    public String getcollegeName()
    {
        return this.collegeName;
    }
    // public String getCollegeType()
    // {
    //     return this.collegeType;
    // }
    public int getCourseCount()
    {
        return this.courseCount;
    }
    public LinkedHashMap getCourseDetails()
    {
        return this.courseDetails;
    }
    public String getAddress()
    {
        return this.address;
    }
    public int getPhoneNumber()
    {
        return this.phoneNumber;
    }
}
