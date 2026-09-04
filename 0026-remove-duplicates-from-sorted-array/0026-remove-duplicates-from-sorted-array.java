class Solution {
    public int removeDuplicates(int[] arr) {
     int n=arr.length;
     int i=0,j=0;
     for(i=0;i<=n-1;i++){
        if(arr[i]!=arr[j]){
            j=j+1;
            arr[j]=arr[i];
        }

     }
     return j+1;  
    }
}