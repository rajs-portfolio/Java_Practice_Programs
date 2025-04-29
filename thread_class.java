class a1 extends Thread // step1
{
    a1() {
        start(); // step2
    }

    public void run() // step3
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("a1's i: " + i);
        }
    }
}

class thread_class {
    public static void main(String args[]) {
        new a1();
        for (int i = 0; i <= 20; i++) {
            System.out.println("Thread main's i= : " + i);
        }
    }
}