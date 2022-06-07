public class Isometric{
    static final int CHAR=26;
    public static boolean iso(String s1, String s2){
        int n=s1.length();
        int m=s2.length();

        if(n!=m){
            return false;
        }
        int [] charCount1=new int[CHAR];
        int [] charCount2=new int[CHAR];

        for(int i=0; i<n; i++){
            charCount1[s1.charAt(i) - 'a']++;
            charCount2[s2.charAt(i) - 'a']++;
        }

        for(int i=0; i<n; i++){
            if(charCount1[s1.charAt(i) - 'a'] != charCount2[s2.charAt(i) - 'a']){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1="aab";
        String s2="xyz";

        if(iso(s1, s2)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}