class Solution {
    public int threeSumClosest(int[] arr, int target) {
        int n= arr.length;
        Arrays.sort(arr);
        int resultsum=arr[0]+arr[1]+arr[2];
        int mindifference=Integer.MAX_VALUE;
        int i;
        for(i=0;i<(n-2);i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==target) return sum;
                else if(sum<target) j++;
                else k--;
                int difftotarget=Math.abs(sum-target);
                if(difftotarget<mindifference){
                    resultsum=sum;
                    mindifference=difftotarget;
                }
            }
        }
        return resultsum;
    }
}