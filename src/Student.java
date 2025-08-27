public class Student {
    protected String address;

    public Student(String address) {
        this.address = address;
    }
    public void show_address()
    {
        System.out.println("Address is "+address);
    }
}