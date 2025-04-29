class outer {
    static int a = 10;
    int c = 30;

    void disp1() {
        Inner ob = new Inner();
        ob.disp2();
    }

    static class Inner {
        int b = 20;

        void disp2() {
            System.out.println(b);
            System.out.println(a);
            outer ob2 = new outer();
            System.out.println(ob2.c);
        }
    }
}

public class nestedclass2 {
    public static void main(String args[]) {
        outer ob = new outer();
        ob.disp1();
    }
}