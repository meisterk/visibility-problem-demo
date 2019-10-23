public class Task implements Runnable{
    private boolean loop; // main-Thread writes to loop, task reads loop
    //private volatile boolean loop; // volatile: loop is always stored in RAM, not in cache
    private int count;

    public Task() {
        this.loop = true;
        count = 0;
    }

    @Override
    public void run() {
        while (this.loop){
            //System.out.println("second thread is running");
            // Don't do any printing here to demonstrate visibility problem
            count++;
        }
        System.out.println("End of second thread. Count: " + count);
    }

    public void stopTask(){
        this.loop = false;
    }
}
