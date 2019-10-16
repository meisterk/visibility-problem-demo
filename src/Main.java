
public class Main {
    public static void main(String[] args) {
        // Create and start new Thread
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("main-thread: second thread is started");
        // let main-Thread sleep
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Try to stop other thread
        task.stopTask();
        System.out.println("main-thread: end of main thread");
    }
}
