package Players_guide;

public class Challenge21 {
    public static void main(String[] args) {

        int result = countdown(10,1);
    }
    public static int countdown (int start, int stop){
        if (start>=stop) {
            System.out.println(start);
            return start + countdown(start - 1, stop);
        }
        return stop;
    }
}
