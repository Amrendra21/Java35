public class Bank {
    private int balance = 10000;
    public void withdraw(int amount){
        if(amount>balance){
            throw new InsufficientBalanceException("Not Enough balance poor kid !");
        }
        else{
            balance -= amount;
            System.out.println("Withdraw Successfull, remaining balance : " + balance);
        }
    }
}
