class Parent {
    int a = 15;
    int b = 30;

    void display() {
        int c = a + b;
        System.out.println("Sum = " + c);
    }
}

class child extends Parent {
    void display() {
        super.display(); // Call the parent class method
        int d = a * b;
        System.out.println("Product = " + d);
    }
}

class method_overriding {
    public static void main(String args[]) {
        child ob = new child();
        ob.display(); // Call the child class method
    }
}
