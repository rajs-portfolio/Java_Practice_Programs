class Thread1 implements Runnable// step1
{
    public void run()// step4
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 1: " + i);
        }
    }
}

class Thread2 implements Runnable// step1
{
    public void run()// step4
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 2: " + i);
        }
    }
}

class Thread3 implements Runnable// step1
{
    public void run()// step4
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 3: " + i);
        }
    }
}

class mul_thread {
    public static void main(String args[]) {
        Thread1 ob1 = new Thread1();
        Thread2 ob2 = new Thread2();
        Thread3 ob3 = new Thread3();
        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);
        Thread t3 = new Thread(ob3);
        t3.start();
        t1.start();
        t2.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread main's i= : " + i);
        }
    }
}