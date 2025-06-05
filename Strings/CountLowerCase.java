// package DSA QUESTIONS.Strings;

public class CountLowerCase {
    public static void main(String[] args) {
        String str = "aeiouVSTAEIOU";

        int count = 0; 
        for(char ch : str.toCharArray())
        {
            if(Character.isLowerCase(ch) && (ch =='a' || ch == 'e' || ch=='i' || ch=='o' || ch=='u') )
            {
                count++;
            }
        }


        System.out.println("No of lower case vowel occurences is:"+count);
    }
}
