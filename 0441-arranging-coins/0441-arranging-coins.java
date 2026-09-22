class Solution {
    public int arrangeCoins(int n) {
        long lo=0,hi=n,ans=0;
        while(lo<=hi){
            long k=lo+(hi-lo)/2;
            long m=k*(k+1)/2;
            if(m==n) return (int)k;
            else if(m>n) hi=k-1;
            else {
                ans=k;
                lo=k+1;
            }

        }
        return (int)ans;
    }    
}