public class t1 {
    static int fact(int n){
        if(n == 1){
            return 1;
        }
        return n*fact(n-1);
    }

    static int findTrailingZeros(int n){
        // n=fact(n);
        // System.out.println(n);
        if (n < 0) 
            return -1; 
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;
        return count;
    }

        

        // while(n != 0){
        //     if(n % 10 == 0){
        //         count++;
        //         n=n/10;
        //     }else{
        //         break;
        //     }
    //     }System.out.println(count);
    // } 
    public static void main(String[] args){
        int n=5;
        System.out.println(findTrailingZeros(n));
    }
    
}


