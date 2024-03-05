public class tracing1 {
    public static void main(String[] args) {
        String s1 = "hello guys";
        String s2 = new String("hello");
        String s3 = "This is how you can learn";

        System.out.println(s1.length());

        System.out.println(s2.toLowerCase());

        String s4 = s1.concat(s3);

        System.out.println(s1);

        System.out.println(s4.charAt(11));

        System.out.println(s3.trim());

        String h1 = "125";
        System.out.println(Integer.parseInt(h1));

        String s5 = s3.substring(20, 25);

        System.out.println(s5);

    }
}