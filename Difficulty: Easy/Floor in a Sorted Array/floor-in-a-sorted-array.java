class Solution {
    static int findFloor(int[] arr, int x) {
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        int idx=-1;
        while(lo<=hi){
          int mid=(lo+hi)/2;
          if(arr[mid]>x) hi=mid-1;
          else{
              idx=mid;
              lo=mid+1;
              
          }
        }
        return idx;
        
    }
}
