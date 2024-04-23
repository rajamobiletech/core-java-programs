public class tutorialspointdupchar {
    public static void main(String[] args) {
        String nm ="vinaykumarreddy";
        char[] carray = nm.toCharArray();
        System.out.println("Duplicate characters in name vinaykumarreddy : " );
        for(int i = 0; i < nm.length(); i++) {
        for(int j = i + 1; j< nm.length(); j++) {     
        if (carray[i] == carray[j]) {
            System.out.print(carray[j] + " ");
            break;
        }}
        }
    }
}
