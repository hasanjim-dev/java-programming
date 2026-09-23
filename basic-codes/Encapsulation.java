class BankAccount
{
    private double balance;

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getBalance()
    {
        return balance;
    }
}

class Encapsulation
{
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount();

        account.setBalance(5000);

        System.out.println("Balance: " + account.getBalance());
    }
}