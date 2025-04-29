class parent {
    void display() {
        System.out.println("This is parent class method.");
    }
}

class child1 extends parent {
    void display() {
        System.out.println("This is child1 class method.");
    }
}

class child2 extends parent {
    void display() {
        System.out.println("This is child2 class method.");
    }
}

class dynamic_method_dispatch {
    public static void main(String args[]) {
        parent p= new parent(); // parent reference and object
        p.display(); // calls parent class method
        child1 ob1= new child1(); // child1 reference and object
        child2 ob2= new child2(); // child2 reference and object
        ob1.display(); // calls child1 class method
        ob2.display();
        p=ob1;
        p.display(); // calls child1 class method
        p=ob2;
        p.display();
    }
}
