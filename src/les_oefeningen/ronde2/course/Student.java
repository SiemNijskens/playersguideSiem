package les_oefeningen.ronde2.course;

public class Student {
    String name;
    String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }
    void printDetails(){
        System.out.println("Student name: " + this.name + " Student id: " + this.id);
    }
}
