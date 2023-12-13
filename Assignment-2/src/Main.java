import StudentManagement.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayListAddStudent st = new ArrayListAddStudent();
        System.out.println("****** Add Student ******");
        st.addStudent(students, new Student("BH001", "Bui Huy Hoang", 10));
        st.addStudent(students, new Student("BH002", "Bui Huy A", 8));
        st.addStudent(students, new Student("BH003", "Bui Huy A+", 4));
        System.out.println("List data of students");
        for (Student s: students){
            System.out.println("ID = " + s.id + ", fullName = " + s.fullName + ", mark = " + s.mark + ", Rank = " + s.rank);
        }

        System.out.println("****** Edit Student ******");
        ArrayListEditStudent edit = new ArrayListEditStudent();
        edit.editStudent(students, 2, new Student("BH009", "Nguyen Van A", 5));
        for (Student s: students){
            System.out.println("ID = " + s.id + ", fullName = " + s.fullName + ", mark = " + s.mark + ", Rank = " + s.rank);
        }

        System.out.println("****** Edit Student By Id ******");
        edit.editStudentById(students, "BH009", new Student("BH009", "Nguyen Van Ty", 9));
        System.out.println("****** List data of students after updated by ID ******");
        for(Student s: students){
            System.out.println("ID = " + s.id + ", fullName = " + s.fullName + ", mark = " + s.mark + ", Rank = " + s.rank);
        }

        System.out.println("****** Remove Student By Id ******");
        ArrayListRemoveStudent remove = new ArrayListRemoveStudent();
        remove.removeStudentById(students, "BH009");
        System.out.println("****** List data of students after updated by ID ******");
        for(Student s: students){
            System.out.println("ID = " + s.id + ", fullName = " + s.fullName + ", mark = " + s.mark + ", Rank = " + s.rank);
        }

        System.out.println("****** Search Student ******");
        ArrayListSearchStudent search = new ArrayListSearchStudent();
        String numberID = "BH001";
        int findst = search.binarySearch(students, numberID);
        if(findst == -1){
            System.out.println("Can not found id = " + numberID);
        } else{
            System.out.println("Found id = " + numberID);
        }

        System.out.println("************* Sort Student by ID *************");
        Collections.sort(students,Student.IdStudentComparator);
        System.out.println("********** List data of students after sort **********");
        for (Student str : students){
            System.out.println(str);
        }

        System.out.println("************* Sort Student by FullName *************");
        Collections.sort(students,Student.FullNameStudentComparator);
        System.out.println("********** List data of students after sort **********");
        for (Student str : students){
            System.out.println(str);
        }

        System.out.println("************* Sort Student by Mark *************");
        Collections.sort(students,Student.MarkComparator);
        System.out.println("********** List data of students after sort **********");
        for (Student str : students){
            System.out.println(str);
        }
    }
}