public class TotalCharacters {
    public static void main(String[] args) {
        String str = "Teacher is teaching";
        int count = 0;
        System.out.println("Input String: "+str);

        //Count total characters in the given string except space
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) != ' ')
                count++;
        }

        // Option2
        str = str.replace(" ", "");
        System.out.println("The total number of characters in the given string: " + str.length());

        //Display total number of characters in the given string
        System.out.println("The total number of characters in the given string: " + count);
    }
}
