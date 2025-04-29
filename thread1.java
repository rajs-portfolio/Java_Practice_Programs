class Thread2 implements Runnable// step1
{
    public void run()// step4
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 1: " + i);
        }
    }
}

class thread1 {
    public static void main(String args[]) {
        Thread2 ob = new Thread2(); // step 2
        Thread t = new Thread(ob);
        t.start();// step 3
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread main's i= : " + i);
        }
    }
}