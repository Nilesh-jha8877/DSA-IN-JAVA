class Solution {
    int single(int[] arr) {
        int n=arr.length;
        int lo=0,hi=n-1;
        if(n==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];
        while(lo<=hi){
         int mid=(hi+lo)/2;
         if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) return arr[mid];
         int f=mid;
         int s=mid;
         if(arr[mid-1]==arr[mid]) f=mid-1;
         else s=mid+1;
         int leftcount=f-lo;
         int rightcount=hi-s;
         if(leftcount%2==0) lo=s+1;
         else hi=f-1;
        }
        return-1;
    }
}