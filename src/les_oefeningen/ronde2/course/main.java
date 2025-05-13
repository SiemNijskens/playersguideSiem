package les_oefeningen.ronde2.course;

public class main {
    public static void main(String[] args) {
        Student s1 = new Student("Siem", "7");
        Teacher T1 = new Teacher("Joris", "joris.vanbreugel@code-cafe.nl");
        Student s2 = new Student("Stefan", "2");
        Student s3 = new Student("Sofia", "5");

        Course course = new Course(T1, s1, s2, s3);
        course.printDetails();
    }
}
