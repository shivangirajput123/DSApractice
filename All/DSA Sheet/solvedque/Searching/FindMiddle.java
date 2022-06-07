public class FindMiddle {
    static int middle(int A, int B, int C){
        if ((A < B && B < C) || (C < B && B < A))
            return B;
 
        else if ((B < A && A < C) || (C < A && A < B))
        return A;
 
        else
        return C;
    }
    public static void main(String[] args) {
        int A=6;
        int B=96;
        int C=8;
        System.out.println(middle(A, B, C));
    }
    
}
