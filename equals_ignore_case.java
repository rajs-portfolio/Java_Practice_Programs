class equals_ignore_case {
    public static void main(String args[])
    {
        String str1= new String("This is really not immutable!!");
        String str2= str1;
        String str3= new String("This is really not immutable");
        String str4= new String("This is really not immutable");
        boolean retVal;

        retVal = str1.equals(str2);
        System.out.println("Returned value= " +retVal);
        retVal = str3.equals(str4);
        System.out.println("Returned value= " +retVal);
        retVal = str3.equalsIgnoreCase(str4);retVal = str1.equals(str2);
        System.out.println("Returned value= " +retVal);
        System.out.println("Returned value= " +retVal);
    }    
}