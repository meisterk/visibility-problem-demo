public class Task implements Runnable{
    private boolean loop;

    public Task() {
        this.loop = true;
    }

    @Override
    public void run() {
        while (this.loop){
            System.out.println("second thread is running");
        }
        System.out.println("end of second thread");
    }

    public void stopTask(){
        this.loop = false;
    }
}
