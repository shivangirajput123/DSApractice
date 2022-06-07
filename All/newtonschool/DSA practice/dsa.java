import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean[] isPrime=new boolean[n+1];
        Arrays.fill(isPrime,true);
        for(int i=2;i*i<=n;i++){
            if(isPrime[i]){
                for(int j=2*i;j<=n;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        int sum = 0;
        for(int i=2;i<n;i++)
            if(isPrime[i]==true)
                sum++;{
                    System.out.println(sum);

                }