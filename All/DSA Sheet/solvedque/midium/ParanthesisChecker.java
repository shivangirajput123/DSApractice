import java.util.Stack;
public class ParanthesisChecker {
    static boolean isPar(String x){
        Stack<Character> st=new Stack<>();
        for(int i=0; i<x.length(); i++){
            char ch=x.charAt(i);
            if(ch =='[' || ch == '{' || ch == '('){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                if(st.size()>0 && st.peek() == '['){
                    char c=st.pop();
                    if(c == '[' && ch == ']'){
                        continue;
                    }else{
                        return false;
                    }
                }
                if(st.size()>0 && st.peek() == '{'){
                    char c=st.pop();
                    if(c == '{' && ch == '}'){
                        continue;
                    }else{
                        return false;
                    }
                }
                if(st.size()>0 && st.peek() == '('){
                    char c=st.pop();
                    if(c == '(' && ch == ')'){
                        continue;
                    }else{
                        return false;
                    }
                }
                
            }
        }return st.size() == 0;
    }
    public static void main(String[] args) {
        String x="[{()}]";
        System.out.println(isPar(x));

        
    }
}
