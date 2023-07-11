import java.util.*;
public class Main {
    static ArrayList<User> usersList=new ArrayList<>();
    static ArrayList<MedicalCollege> medicalCollegeList=new ArrayList<>();
    static ArrayList<EngineeringCollege> engineeringCollegeList=new ArrayList<>();
    public static boolean check(String userName,String password)
    {
        int flag=0;
        for(int i=0;i<usersList.size();i++)
        {
            if(usersList.get(i).getUserName().equals(userName) && usersList.get(i).getPassword().equals(password))
            {
                flag=1;
                break;
            }
        }
        return flag==1;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=0,flag=0;
        do{
            if(t!=1){
                System.out.println("1.Log In  2.Register   3.Exit");
                t=s.nextInt();
                s.nextLine();
            }
            if(t==2)
            {
                System.out.println("UserName:");
                String uName=s.nextLine();
                System.out.println("Password:");
                String pass=s.nextLine();
                System.out.println("Phone Number:");
                int ph=s.nextInt();
                s.nextLine();
                System.out.println("E-mail:");
                String email=s.nextLine();
                
                User user=new User(uName,pass,ph,email);
                usersList.add(user);
            }
            else if(t==1)
            {
                System.out.println("UserName:");
                String userName=s.nextLine();
                System.out.println("Password:");
                String password=s.nextLine();

                if(check(userName,password))
                {
                    flag=1;
                    System.out.println("Welcome");
                    break;
                }
                else
                System.out.println("UserName/Password is wrong");
            }
            else 
            break;
        }
        while(t!=3);

        if(flag==1)
        {
            int choice=0;
            System.out.println("Select 1.Engineering 2.Medical");
            choice=s.nextInt();
            float cuttOff;
            int mark;
            if(choice==1)
            {
                System.out.println("Enter Your CuttOff");
                cuttOff=s.nextFloat();
            }
            else
            {
                System.out.println("Enter Your CuttOff");
                mark=s.nextInt();
            }
        }

        s.close();
    }
}
