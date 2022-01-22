public class RunnableTimer implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            System.out.println(1);
        }
    }
}
