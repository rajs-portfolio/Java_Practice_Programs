class thread_eg {
    public static void main(String args[]) {
        Thread ob = Thread.currentThread(); // Getting the current thread
        System.out.println("Current Thread: " + ob); // Printing thread details

        ob.setName("Raj"); // Setting thread name
        ob.setPriority(10); // Setting thread priority

        System.out.println("Updated Thread: " + ob); // Printing updated thread details
    }
}