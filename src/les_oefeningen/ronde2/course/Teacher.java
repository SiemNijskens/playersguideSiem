package les_oefeningen.ronde2.course;

public class Teacher {
    String name;
    String email;

    Teacher (String name, String email){
        this.name = name;
        this.email = email;
    }
    void printDetails(){
        System.out.println("Teacher name: " + this.name + " Teacher id: " + this.email);
    }
}
