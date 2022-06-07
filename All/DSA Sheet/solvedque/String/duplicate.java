import javax.print.DocFlavor.CHAR_ARRAY;

public class duplicate {
    static final int max_char=256;
    static void fullchar(String str, int [] count){
        for(int i=0; i<str.length(); i++){
            count[str.charAt(i)]++;
        }
    }
    static void dups(String str){
        int count[]=new int [max_char];
        fullchar(str, count);
        for(int i=0; i<max_char; i++){
            if(count[i]>1){
                System.out.println((char)(i) + " " + count[i]);
            }
            
        }
    }
    
    public static void main(String [] args){
        String str="test string";
        dups(str);

    }
    
}
