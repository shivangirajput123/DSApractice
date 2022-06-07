import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicateInString {
    static void duplicate(String s){
        char words[]=s.toCharArray();
        Map<Character, Integer> charMap=new HashMap<Character, Integer>();
        for(Character ch : words){
            if(charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch) + 1);
            }
            else{
                charMap.put(ch, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entrySet=charMap.entrySet();
        for(Map.Entry<Character, Integer> entry : entrySet){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }

        }      


    }
    public static void main(String[] args){
        String s="fhgiufkhvbufgnh";
        duplicate(s);
       
    }
    
}
