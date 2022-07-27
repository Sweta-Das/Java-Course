class WrapperClass{
    public static void main(String[] args) {

        // creating primitive data type
        int a = 5;
        double b = 5.67;

        // converting into wrapper object
        Integer aObj = Integer.valueOf(a);
        Double bObj = Double.valueOf(b);

        // To check whether object is created or not
        if (aObj instanceof Integer) {
            System.out.println("An object of Integer is created....");
        }

        if (bObj instanceof Double) {
            System.out.println("An object of Float is created....");
        }
    }

}