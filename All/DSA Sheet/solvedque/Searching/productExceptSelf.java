// Given an array nums[] of size n, construct a Product Array P (of same size n) such that P[i] is equal to the product of all the elements of nums except nums[i].
/*Input:
n = 5
nums[] = {10, 3, 5, 6, 2}
Output:
180 600 360 300 900
Explanation: 
For i=0, P[i] = 3*5*6*2 = 180.
For i=1, P[i] = 10*5*6*2 = 600.
For i=2, P[i] = 10*3*6*2 = 360.
For i=3, P[i] = 10*3*5*2 = 300.
For i=4, P[i] = 10*3*5*6 = 900.*/

public class productExceptSelf {
    public static void main(String[] args) {
        int n = 5;
        int a[] = {10, 3, 5, 6, 2};
        int p[] = new int[n];
        for (int i=0; i<n; i++) {
            int sum = 1;
            for (int j=0; j<n; j++) {
                if (i!=j) {
                    sum = sum*a[j];
                }
            }
            p[i] = sum;
        }
        for (int i=0; i<n; i++ ){
            System.out.print(p[i]+" ");
        }
    }
}
