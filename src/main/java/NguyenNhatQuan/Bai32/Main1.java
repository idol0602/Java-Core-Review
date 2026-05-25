package NguyenNhatQuan.Bai32;

public class Main1 {

    static class MyWorker extends Thread {
        @Override
        public void run() {
            System.out.println("Hello");
        }
    }

    static class MyTask implements Runnable {
        @Override
        public void run() {
            System.out.println("Task running");
        }
    }

    public static void main(String[] args) {
        MyWorker myWorker = new MyWorker();
        myWorker.start();

        MyTask myTask = new MyTask();
        Thread t = new Thread(myTask);
        t.start();
    }
}
