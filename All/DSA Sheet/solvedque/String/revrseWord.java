// Input: s = "Let's take LeetCode contest"
// Output: "s'teL ekat edoCteeL tsetnoc"
public class revrseWord {
    public static String reverseWords(String s) {
        String fin = "";
        String arr[] = s.split(" ");
        for(int i = 0;i<arr.length;i++){
            StringBuilder str = new StringBuilder(arr[i]);
            fin += (str.reverse()).toString();
            fin += " ";
        }
        return fin.substring(0,fin.length()-1);        
    }

    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        System.out.println(reverseWords(s) + " ");

    }    
}
