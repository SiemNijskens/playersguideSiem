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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        int i=0;
        for (char ch : email.toCharArray()){
            if (ch == '@'){
                i++;
            }
        }
        if (i==1){
            this.email = email;
        }
        else {
            System.out.println("not a valid email adres");
        }
    }
}
