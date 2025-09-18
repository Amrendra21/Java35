package Unit3;

import java.util.ArrayList;
import java.util.Collections;

public class StudentObjects {
    public static void main(String[] args) {
        ArrayList<Student> std1 = new ArrayList<>();
        std1.add(new Student(21,"Vijay",100));
        std1.add(new Student(20,"Abhi",101));
        std1.add(new Student(22,"Rahul",102));
        std1.add(new Student(23,"Ravi",103));
        std1.add(new Student(24,"Ramesh",104));
        std1.add(new Student(19,"Gyan",105));

        Collections.sort(std1);
        for(Student st:std1){
            System.out.println("Name: "+st.name+" Age: "+st.age+"Roll No. : "+st.roll_no);
        }
    }

}
