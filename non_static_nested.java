class outer {
    static int d = 50;
    int a = 10;

    void disp1() {
        System.out.println(a);
        Inner ob = new Inner();
        ob.disp2();
    }

    class Inner {
        int b = 20;

        void disp2() {
            System.out.println(b);
            System.out.println(a);
            System.out.println(d);
        }
    }
}

public class non_static_nested {
    public static void main(String[] args) {
        outer ob = new outer();
        ob.disp1();
    }
}