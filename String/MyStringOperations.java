
public class MyStringOperations {
    public static void main(String[] args) {
        String s1 = "Zawadullah Bhuiyan Sanjid";
        String s2 = new String("Mubassira Binte Rahman");
        String s3 = "";

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.isEmpty());
        System.out.println(s3.isEmpty());

        System.out.println(s1.length());
        System.out.println(s2.length());

        System.out.println(s1.concat(s2));

        System.out.println(s1.charAt(1));
        System.out.println(s1.substring(1, 10));

        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
    }
}