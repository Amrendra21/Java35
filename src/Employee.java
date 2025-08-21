public class Employee {
    int emp_id;
    String emp_name;
    double emp_salary;

    static String emp_org = "Amazon";

    public Employee(int emp_id, String emp_name, double emp_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_salary = emp_salary;
    }

    public void display(){
        System.out.println("Employee id:  " + emp_id);
        System.out.println("Employee name: " + emp_name);
        System.out.println("Employee salary: " + emp_salary);
    }

    public static void emp_info(){
        System.out.println("Employee Works in : " + emp_org + "\n");
    }

}
