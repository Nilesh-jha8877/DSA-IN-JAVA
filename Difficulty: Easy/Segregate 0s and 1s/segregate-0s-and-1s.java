class Solution {
    void segregate0and1(int[] arr) {
        int no_of_zeros=0;
        int no_of_ones=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) no_of_zeros++;
            else no_of_ones++;
        }
        for(int i=0;i<no_of_zeros;i++){
            arr[i]=0;
        }
        for(int i=no_of_zeros;i<arr.length;i++){
            arr[i]=1;
        }
    }
}
