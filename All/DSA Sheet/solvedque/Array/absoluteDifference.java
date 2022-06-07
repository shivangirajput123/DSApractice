public class absoluteDifference {
    static int countKDifference(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++)
                if(k ==Math.abs(nums[i] - nums[j]))
                    count++;           
            }return count;        
    }
    public static void main(String [] args){
        int nums[]={1,2,2,1};
        int k=1;
        System.out.println(countKDifference(nums, k));

    }
    
}
