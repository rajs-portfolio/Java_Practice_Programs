class throweg {
    void check(String s1) {
        char ch;
        ch = s1.charAt(0);
        if (ch == 'A') {
            System.out.println("Valid Id");
        } else {
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException e) {
                System.out.println("Invalid Id");
            }
        }
    }
}

class throw_eg {
    public static void main(String args[]) {
        throweg obj = new throweg();
        obj.check("Aaj");
    }
}   