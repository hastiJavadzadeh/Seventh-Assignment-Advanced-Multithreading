package sbu.cs.Semaphore;

import java.util.concurrent.Semaphore;

public class Resource {
    static Semaphore semaphore = new Semaphore(2);
    public static void accessResource(String name) {
        try {
            semaphore.acquire();
            System.out.println("name:" + name + "system time : " + System.currentTimeMillis());
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
