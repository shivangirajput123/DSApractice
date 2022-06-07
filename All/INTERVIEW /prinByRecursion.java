public class prinByRecursion {
    public static void main(String[] args){
        print(1);

    }
    static void print(int num){
        if(num<=100){
            System.out.println(num);
            num++;
            print(num);
        }
    }
    
}
