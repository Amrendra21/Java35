public class MyException {
    public static void main(String[] args) {
        UserDefinedException udf = new UserDefinedException();
        try{
            udf.validates(13);
        }
        catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
