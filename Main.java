import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Welcome_Screen();
        Scanner sc = new Scanner(System.in);
        int user_state = sc.nextInt();
        if(user_state==1)
        {
            new_user();
        } else if (user_state==2) {
            existing_user();
        }
        else {
            System.out.println("Please Enter a valid Number");
            Welcome_Screen();
        }
    }
    public static void Welcome_Screen()
    {
        System.out.println("Hello Welcome to the HDFC Bank");
        System.out.println("Please Select the service for you");
        System.out.println("-----------------------------------");
        System.out.println("1. New User\n2.Existing User");
    }
    public static void new_user()
    {
        System.out.println("Welcome to HDFC!");
        Customer coustomer = new Customer();
        coustomer.New_Customer();
    }
    public static void existing_user()
    {
        System.out.println("Welcome to your Bank");
        System.out.println("Please enter you CustomerId");

    }
}
