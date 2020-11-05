package common;

public class Thread {
    public static void sleep(int time){
        try {
            java.lang.Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
