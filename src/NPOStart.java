public class NPOStart {
    public static void main(String[] args) {
        int i = 0;
        initializeUI(i);
        boolean authentication = true;
        boolean validation = true;
        setAuthentication(authentication);
        setValidation(validation);

        if (validation && authentication) {
            boolean run = true;
            integrateLiveVieuwing(run);
            connectNPO(1);
            connectNPO(2);
            connectNPO(3);

            connectToDatabase(1);
            settupTVGuide(1);
            innitializingJinekWardrobeCheck("Eva");
            playingSinterklaasJournaal();
        }
    }

    private static void innitializingJinekWardrobeCheck(String Boobies) {

    }

    public static void playingSinterklaasJournaal() {

    }

    private static void setAuthentication(boolean authentication) {
        authentication = true;
    }

    public static void setValidation(boolean validation) {
        validation = true;
    }

    public static void initializeUI(int i) {
        //initializes UI
    }

    public static void integrateLiveVieuwing(boolean run) {

    }

    public static void connectNPO(int channel) {

    }

    public static void connectToDatabase(int channel) {

    }

    public static void settupTVGuide(int channel) {

    }
}