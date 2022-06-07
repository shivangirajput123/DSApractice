import java.util.Arrays;

public class longestCommonPrifix {
    public static String lcp(String[] s){
        if(s.length == 1){
            return s[0];
        }
        Arrays.sort(s);
       
        int n=s[0].length();
        int count=0;
        StringBuilder builder=new StringBuilder();
        if(count<n){
            for(int i=s.length-1; i>=0; i--){
                if(s[0].charAt(count) == s[s.length-1].charAt(count)){
                    builder.append(s[0].charAt(count));
                }
                else{
                    break;
                }
                count++; 
            }                 
            
        }
        return builder.toString();
    }
    public static void main(String[] args) {
        String[] s= {"apple", "ape", "april"};
        System.out.println(lcp(s));
             
        
    }
    
}
