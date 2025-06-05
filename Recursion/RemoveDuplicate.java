// package DSA QUESTIONS.Recursion;

public class RemoveDuplicate {
    public static void main(String[] args)
     {
        String s = "aaabbbcccdddeee";
        StringBuffer sb = new StringBuffer();
        boolean map[] = new boolean[25];
        System.out.println(removeDuplicate(s,0,sb,map));
    }
    
    public static String removeDuplicate(String s, int i, StringBuffer sb, boolean map[])
    {
        if(i==s.length())
        {
            return sb.toString();
        }

        else if(map[s.charAt(i)-'a'] != true)  // if charater is not present in the map
        {
            map[s.charAt(i)-'a'] = true;
            sb.append(s.charAt(i));
        }
        return removeDuplicate(s, i+1, sb, map);
    }

}
