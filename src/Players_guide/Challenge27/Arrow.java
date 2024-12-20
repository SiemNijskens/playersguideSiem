package Players_guide.Challenge27;

public class Arrow {
    private float length;
    private Fletching fletching;
    private Head head;

    public Arrow(float length, Fletching fletching, Head head) {
        this.length = length;
        this.fletching = fletching;
        this.head = head;
        System.out.println("here is your arrow with a " + head + " head, " + fletching + " fletching and a length of: " + length + " cm");
    }
    public Arrow(){
        this.length=0;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setFletching(Fletching fletching) {
        this.fletching = fletching;
    }

    public Fletching getFletching() {
        return fletching;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public static Arrow createEliteArrow() {
        return new Arrow(95, Fletching.PLASTIC, Head.STEEL);
    }
    public static Arrow createBeginnerArrow() {
        return new Arrow(75, Fletching.GOOSE_FEATHERS, Head.WOOD);
    }
    public static Arrow createMarksmanArrow() {
        return new Arrow(65, Fletching.GOOSE_FEATHERS, Head.STEEL);
    }
}
