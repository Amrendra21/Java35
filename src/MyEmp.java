public class MyEmp {
    static{
        System.out.println("I am in the static block");
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(101,"Amrendra Singh",700000.321);
        Employee e2 = new Employee(102,"Amit Kumar",50000.123);

        System.out.println("I am in main block");
        e1.display();
        e1.emp_info();

        e2.display();
        e2.emp_info();


        Employee.emp_info();



    }
}

