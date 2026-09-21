class Solution {
    public int mySqrt(int x) {
       int lo=1;
       int hi=x;
       if(x==0) return 0;
       while(lo<=hi){
        int mid=lo+(hi-lo)/2;
        if(mid>x/mid) hi=mid-1;
        else if(mid<x/mid) lo=mid+1;
        else{
            return mid;
        }

       } 
       return hi;
    }
}