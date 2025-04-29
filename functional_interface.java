interface A {
    void display1();
}

class functional_interface {
    public static void main(String[] args) {
        A obj = new A() //anonymous inner class 
        {
            public void display1() {
                System.out.println("This is implementation using anonymous inner class.");
            }
        };
        obj.display1();
    }
}