package Players_guide.Challenge26;

public class Arrow {
    private static float length;
    private static Fletching fletching;
    private static Head head;

    public Arrow (float length, Fletching fletching, Head head){
        Arrow.length = length;
        Arrow.fletching = fletching;
        Arrow.head = head;
        System.out.println("here is your arrow with a " + head + " head, " + fletching + " fletching and a length of: " + length + " cm");
    }

    public static float getLength() {
        return length;
    }

    public static void setLength(float length) {
        Arrow.length = length;
    }
    public static void setFletching(Fletching fletching){
        Arrow.fletching = fletching;
    }

    public static Fletching getFletching() {
        return fletching;
    }

    public static Head getHead(){
        return head;
    }

    public static void setHead(Head head) {
        Arrow.head = head;
    }
}
