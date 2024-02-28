import java.util.*;
public class Customer {
    Scanner sc = new Scanner(System.in);
    private String Cust_name;
    private int age;
    private long Aadhar_no;
    private int cust_id;
    private long Acct_No;

    public Customer()
    {

    }

    public Customer(String cust_name, int age, long aadhar_no) {
        this.Cust_name = cust_name;
        this.age = age;
        this.Aadhar_no = aadhar_no;
    }

    public Customer(int cust_id, long acct_No) {
        this.cust_id = cust_id;
        Acct_No = acct_No;
    }

    public Customer(String cust_name, int age, long aadhar_no, int cust_id, long acct_No) {
        this.Cust_name = cust_name;
        this.age = age;
        this.Aadhar_no = aadhar_no;
        this.cust_id = cust_id;
        this.Acct_No = acct_No;
    }

    void New_Customer()
    {
        System.out.println("Please Enter your Name:");
        String Name = sc.nextLine();
        System.out.println("Please Enter your Age:");
        int age = sc.nextInt();
        System.out.println("Please Enter your Aadhar Number");
        long Aadhar = sc.nextLong();
        Random random_acct_no = new Random();
        Random random_Cust_id = new Random();
        int cust_id = generateCustid(random_Cust_id);
        long acct_no = generateAcctNumber(random_acct_no);
        Customer customer = new Customer(Name,age,Aadhar,cust_id,acct_no);
        System.out.println("Hi"+ Name + " Welcome to Hdfc Banking! Have a great Banking Ahead");
        System.out.println("Here is your Customer ID: "+ customer.cust_id);
        System.out.println("Here is your Account Number:" + customer.Acct_No);
    }
    private static long generateAcctNumber(Random random) {
        return (long) (Math.pow(10, 14) + random.nextDouble() * Math.pow(10, 14));
    }
    private static int generateCustid(Random random) {
        return random.nextInt(900000) + 100000;
    }
}

