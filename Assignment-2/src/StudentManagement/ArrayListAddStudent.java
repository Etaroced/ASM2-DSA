package StudentManagement;

import java.util.ArrayList;

public class ArrayListAddStudent {
    public void addStudent(ArrayList<Student> students, Student objectData){
        students.add(objectData);

        //View data
        for (Object s: students){
            System.out.println("In for student " + s.toString());
        }
    }
}
