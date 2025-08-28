public class MyBank {
    public static void main(String[] args) {
        Bank b = new Bank();
        try{
            b.withdraw(10000000);
        }
        catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
