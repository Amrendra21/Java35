public class CollegeStudent extends Student{
    public int roll_no;

    public CollegeStudent(String address, int roll_no) {
        super(address);
        this.roll_no = roll_no;
    }
    public void show_roll()
    {
        System.out.println("Roll No is "+roll_no);
    }
}