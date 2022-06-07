
public class Count {
    public static String countAndSay(int n){
        if(n == 1){
            return "1";
        }
        int count=0;
        String s=countAndSay(n-1);
        String result="";
        for(int i=0; i<s.length(); i++){
            count++;
            if(i == s.length()-1 || s.charAt(i) != s.charAt(i+1)){
                result=result+String.valueOf(count)+String.valueOf(s.charAt(i));
                count=0;
            }
        }return result;

        
    }
    public static void main(String [] args){
        int n=4;
        System.out.println(countAndSay(n));

    }
}