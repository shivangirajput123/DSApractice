

public class CountWord {
    public static void main(String[] args){
        String input="Hello World aa";
        if (input == null || input.isEmpty()) {
            System.out.println("0");
        } 
        String[] words = input.split("\\s+");      

        System.out.println(words.length);


    }
    
}
