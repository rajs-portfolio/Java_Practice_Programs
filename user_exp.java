class nomatch extends Exception { // userdefined exception
}

class throweg {
    void check(String s1) throws nomatch {
        char ch;
        ch = s1.charAt(0);
        if (ch == 'M') {
            System.out.println("Valid Id");
        } else {
            throw new nomatch(); // throwing userdefined exception
        }
    }

}
class user_exp {
    public static void main(String args[]) {
        throweg obj = new throweg();
        try {
            obj.check("Raj");
        } catch (nomatch e) {
            System.out.println("Thanks");
        }
    }
}
