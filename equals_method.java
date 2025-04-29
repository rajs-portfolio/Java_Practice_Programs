class equals_method {
    public static void main(String args[])
    {
        String str1= new String("This is really not immutable!!");
        String str2= str1;
        String str3= new String("This is really not immutable");
        boolean retVal;

        retVal = str1.equals(str3);
        System.out.println("Returned value= " +retVal);
    }    
}
