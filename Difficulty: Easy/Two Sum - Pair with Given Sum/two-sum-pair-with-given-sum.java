class Solution {
    boolean twoSum(int arr[], int tar){
        Arrays.sort(arr);
        int n=arr.length;
        int lo=0,hi=n-1;
        while(lo<hi){
            if(arr[lo]+arr[hi]==tar) return true;
            else if (arr[lo]+arr[hi]>tar) hi--;
            else lo++;
        }
        return false;
    }
}