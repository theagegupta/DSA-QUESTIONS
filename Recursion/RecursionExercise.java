public class RecursionExercise {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,4,10};
        int key = 4;
        findOccurences(arr,key,0);
        // String result = "";
        System.out.println();
        System.out.println("Number to string is: "+convertToString(69696969).trim());
        System.out.println("Number of substrings starting and ending with same character:");
        System.out.println(countSubstrings("abcab"));
        
    }

    public static void findOccurences(int arr[],int key, int i)
    {
        if(i==arr.length)
        {
            return ;
        }
        if(arr[i] == key)
        {

            System.out.print(i+" ");
        }

        findOccurences(arr, key, i+1);
    }

    public static int countSubstrings(String str)
    {
        return 0;
    }


    public static String convertToString(int n)
    {

    if(n == 0)
    {
        return "";
    }


    String result = convertToString(n/10);
    
    if(n%10==0)
    {  
        result+="zero";
    }
    else if(n%10 == 1)
    {
        result += "one";
    }
    else if(n%10 == 2)
    {
        result += "two";
    }
    else if(n%10 == 3)
    {
        result += "three";
    }
    else if(n%10 == 4)
    {
        result += "four";
    }
    else if(n%10 == 5)
    {
        result += "five";
    }
    else if(n%10 == 6)
    {
        result += "six";
    }
    else if(n%10 == 7)
    {
        result += "seven";
    }
    else if(n%10 == 8)
    {
        result += "eight";
    }
    else
    {
        result += "nine";
    }
    
    return result+" ";
    }
}
