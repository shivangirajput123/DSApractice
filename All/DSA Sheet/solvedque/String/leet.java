public class leet {
    static void maxDepth(String s) {
        int count = 0, max = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                count++;
            }
            max = Math.max(max, count);
            if(s.charAt(i) == ')'){
                count--;
            }
        }
        System.out.println(max);
    }

    public static void main(String [] args){
        String s="(1+(2*3)+((8)/4))+1";
        maxDepth(s);
    }
    
}
