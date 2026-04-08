public class string_Op {
    public static void main(String[] args) {
        String a = "hello";
        String b = "HeLLo";
        String c = "HELLO";

        String d= a.toLowerCase();
        System.out.println(a);
        System.out.println(d);
        String e= b.toUpperCase();
        System.out.println(b);
        System.out.println(e);
        String f= c.toLowerCase();
        System.out.println(c);
        System.out.println(f);
        System.out.println(a.equals(b));
        System.out.println(a.equals(f));
        System.out.println(a.equalsIgnoreCase(b));

        // Substring functions
        String g =a.substring(2);
        String h =a.substring(1,4);
        System.out.println(g);
        System.out.println(h);
        System.out.println(a);
    }
}
