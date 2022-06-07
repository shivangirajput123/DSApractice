public class palindrom {
    public static boolean isPalindorm(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }return true;
    }
    public static void main(String[] args) {
        String s="madan";

        if(isPalindorm(s)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        

    }
    
}
