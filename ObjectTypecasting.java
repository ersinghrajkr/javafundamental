public class ObjectTypecasting {

    public static void main(String[] args) {
        // Example-1
        Object o = new String("Object Typecasting");

        StringBuffer sb = (StringBuffer) o;
       // A           b  = (C)            d;

        // Example-2
        String s = new String("Object Typecasting");

        StringBuffer sb1 = (StringBuffer)s;
        // A           b  = (C)            d;

        // Example-2
        String s1 = new String("Object Typecasting");

        String sb2 = (String)s1;
        // A           b  = (C)            d;
    }
}
