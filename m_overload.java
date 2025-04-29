class func_overload {
    void disp() {
        System.out.println("No arguments");
    }

    void disp(int x) {
        System.out.println(x);
    }

    void disp(int x, int y) {
        System.out.println(x + " " + y);
    }
}

public class m_overload {

    public static void main(String args[]) {
        func_overload ob = new func_overload();
        ob.disp(50, 60);
        ob.disp();
        ob.disp(90);
    }
}
