package Players_guide.Challenge25;

public class Arrow {
    float length;
    Fletching fletching;
    Head head;

    public Arrow (float length, Fletching fletching, Head head){
        this.length=length;
        this.fletching = fletching;
        this.head = head;
        System.out.println("here is your arrow with a " + head + " head, " + fletching + " fletching and a length of: " + length + " cm");
    }
}
