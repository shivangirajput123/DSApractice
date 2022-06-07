import java.util.ArrayList;
import java.util.List;

public class FindSubSequence {
    static List<String> a1 = new ArrayList<>();
    public static void subSequence(String s, String ans){
        if(s.length() == 0){
            a1.add(ans);
            return;
        }
        subSequence(s.substring(1), ans+s.charAt(0));
        subSequence(s.substring(1), ans);
    }


    public static void main(String[] args) {
        String s="aaaaa";
        String ans="";
        subSequence(s, ans);
        System.out.println(a1);

        
    }
    
}
