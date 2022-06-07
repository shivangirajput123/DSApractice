public class vowel {
    static boolean isVowel(char t){
        return t =='a' || t =='a' || t =='a' || t =='a' || t =='a';
    }
    public static void main(String [] args){
        String s="fijiore"; 
        
        int count=0;
        for(int i=0; i<s.length(); i++){
            char m=s.charAt(i);
            if(isVowel(m)){
                count++;
                
            }
        }System.out.println(count);

    }
    
}
