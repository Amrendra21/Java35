public class UserDefinedException {
    public void validates(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException(("Not eligible to vote age less than 18"));
        }
        else{
            System.out.println("Eligible to vote!");
        }
    }
}
