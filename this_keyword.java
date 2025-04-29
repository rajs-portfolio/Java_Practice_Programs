class this_eg {
    int a, b;

    this_eg(int a, int b) {
        a = a;
        b = b;
    }

    void disp() {
        System.out.println("a = " + a + ", b = " + b);
    }
}

class this_keyword {
    public static void main(String args[]) {
        this_eg ob = new this_eg(20, 40);
        ob.disp(); // Call the method to display values
    }
}


// 
