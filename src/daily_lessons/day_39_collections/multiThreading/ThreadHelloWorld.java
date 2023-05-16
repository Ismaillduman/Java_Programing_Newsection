package daily_lessons.day_39_collections.multiThreading;

public class ThreadHelloWorld extends Thread {
    int threadNum;

    public ThreadHelloWorld (int threadNum){
        this.threadNum=threadNum;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Hello World "+ i+" from thread "+ threadNum);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }
    }
}
