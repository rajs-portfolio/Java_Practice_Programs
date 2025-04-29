class test {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            try{
                System.out.println(i);
                Thread.sleep(2000); // Sleep for 2 second
            }
            catch(InterruptedException e) {
        }
        }
    }
}