package les_oefeningen.ronde2.course;

import java.util.List;

public class Course {
    Teacher teacher;
    List<Student> students;

    public Course(Teacher teacher, Student... students){
        this.teacher = teacher;
        this.students = List.of(students);
    }

    void printDetails(){
        this.teacher.printDetails();
        for (Student student: students){
            student.printDetails();
        }
    }

}
