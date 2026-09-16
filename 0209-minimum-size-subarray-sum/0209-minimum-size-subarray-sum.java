class Solution {
    public int minSubArrayLen(int target, int[] arr) {
       int n=arr.length;
       int minlinewindow=Integer.MAX_VALUE;
       int low=0;
       int high=0;
       int currentsum=0;
       for(high=0;high<n;high++){
        currentsum+=arr[high];
         while(currentsum>=target){
            int currentwindow=high-low+1;
            minlinewindow=Math.min(minlinewindow,currentwindow);
            currentsum=currentsum-arr[low];
            low++;
         }
       }
       return minlinewindow==Integer.MAX_VALUE?0:minlinewindow; 
    }
}