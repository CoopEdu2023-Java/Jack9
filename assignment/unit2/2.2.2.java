abstract class BankAccount{
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}
class SavingsAccount extends BankAccount{
    @Override
    public void deposit(double amount){}
    @Override
    public void withdraw(double amount){}
}
class CurrentAccount extends BankAccount{
    @Override
    public void deposit(double amount){}
    @Override
    public void withdraw(double amount){}
}