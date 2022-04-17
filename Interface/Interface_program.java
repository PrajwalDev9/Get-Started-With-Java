class Account    								//Class Account Intialized
{
    public static void main(String s[])					
    {
    
        IAccount account = new StateBankAccount();			//Object Declaration
    
        System.out.println("Transacting using State Bank Account by Employee");			//Dsiplay Statement
        transactOnAccount(account);
    }
    
    public static void transactOnAccount(IAccount account)					//transcationonAccount Function Intialized
    {
        System.out.println("--------------Account Transaction Details----------------");		
        account.deposit(10000.0);
        printBalance("depositing 10,000.0", account);
        account.withdraw(2500.0);
        printBalance("withdrawing 2,500.0", account);
        account.withdraw(4100.0);
        printBalance("withdrawing 4,100.0", account);
        account.deposit(5000.0);
        printBalance("depositing 5,000.0", account);
        System.out.println("------------------------------");
    }
    
    public static void printBalance(String message, IAccount account)			//printBalance Function
    {
        System.out.println("The balance after " + message +" Rs"+ " is Rs."+ account.getBalance() +".");
    }

}

interface IAccount				//Interface for IAccount
{
    double getBalance();	

    void deposit(double amount);

    void withdraw(double amount);
}


class StateBankAccount implements IAccount			//Implemented Class for StateBankAccount
{
    double balance;

    public double getBalance()					//getBalanace Method
    {
        return balance;
    }

    public void deposit(double amount)			//Deposit Method
    {
        balance += amount;
    }

    public void withdraw(double amount)			//Withdraw Method
    {
        balance -= amount;
    }
}