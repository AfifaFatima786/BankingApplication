
import java.util.*;
public class Bank
{
    static int balance;
    static int PreviousTransaction;
    static String CustomerName;
    static String CustomerId;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name and Id");
        CustomerName=sc.nextLine();
        CustomerId=sc.nextLine();
        Bank obj=new Bank(CustomerName,CustomerId);
        obj.show();

}

 

    

 Bank(String cusname,String cusId)
{
    CustomerName=cusname;
    CustomerId=cusId;

}
 static void deposit(int amount)
{
    if(amount>0)
    {
        balance=balance+amount;
        PreviousTransaction=amount;

    }
}
static void withdraw(int amount)
{
    if(amount>0)
    {
        balance=balance-amount;
        PreviousTransaction=-amount;
}
}
static void getPreviousTransaction()
{
    if(PreviousTransaction>0)
System.out.println("Deposited amount is: "+PreviousTransaction);

else if(PreviousTransaction<0)
System.out.println("Withdrawal amount is: "+Math.abs(PreviousTransaction));

else
System.out.println("Transaction didn't occured");
}

 static void show()
{
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Welcome "+CustomerName);
    System.out.println("Your Id is "+CustomerId+"\n");
    System.out.println("Press 1 to Check Balance");
    System.out.println("Press 2 to Deposit Amount");
    System.out.println("Press 3 to Withdraw Amount");
    System.out.println("Press 4 to check Previous Transaction");
    System.out.println("Press 5 to take Exit");
     int ch;
    do
    {
    System.out.println("Enter the Option as mentioned");
     ch=sc.nextInt();


    switch(ch)
    {
    case 1: 
    
    System.out.println("Your Current Balance is "+balance);
    break;
    
    case 2:
    
    System.out.println("Enter the amount to be deposited");
    int amount=sc.nextInt();
    deposit(amount);
    System.out.println("Total balance is "+balance);
    break;
    
    case 3:
    
        System.out.println("Enter the amount to withdraw");
        int amount=sc.nextInt();
        withdraw(amount);
        System.out.println("Total balance is "+balance);
        break;
    
    case 4:
    
        getPreviousTransaction();
        break;
        
    
    case 5:
    
        break;
    
    default:
    System.out.println("Invalid option!!! Please Enter Again");
    break;
}
    }
    while(ch==5);

System.out.println("Thankyou !");
}



}

