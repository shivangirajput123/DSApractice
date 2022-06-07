public class CountSquares {
    public static int count(int N){
        int i=1;
        while(i*i<N){
            i++;
        }return i-1;
    }
    public static void main(String[] args) {
        int N=9;
        System.out.println(count(N));
    }
    
}
