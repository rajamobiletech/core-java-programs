public class StringExamples {
    public static void main(String[] args) {
        String s1 = "Raja";
        String s2 = new String("Raja");

        String s4 = "Raja";

        char firstChar = s1.charAt(0);
        System.out.println(firstChar);

        int isCompare = s1.compareTo(s2);
        System.out.println(isCompare);

        System.out.println(s1 == s2);

        System.out.println(s4 == s1);

        String s3 = s1.concat(s2);
        System.out.println(s3);

        boolean isEqual = s1.equals(s2);
        System.out.println(isEqual);

        System.out.println("====================");

        String s5 = "Teacher is teaching";
        boolean isContain = s5.contains("teach");
        System.out.println(isContain);


        boolean isContent= s5.contentEquals("Teacher");
        System.out.println(isContent);

        String s6 = String.format("Teacher %c teaching", 's');
        System.out.println(s6);

        String s7 = s6.join("---", "Teacher","is","teaching");
        System.out.println(s7);

    }
}
