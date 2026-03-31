package NguyenNhatQuan.Bai8;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    int count;
    private final Lock lock = new ReentrantLock();
//    public synchronized void increment() {
//        count++;
//    }

//    public void increment() {
//        synchronized (this) {
//            count++;
//        }
//    }

    public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }
}
