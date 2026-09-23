class Solution {
    public boolean searchMatrix(int[][] arr, int x) {
       int row=arr.length;
       int col=arr[0].length;
       int i=0,j=row*col-1;
       while(i<=j){
           int mid=(i+j)/2;
           int midrow=mid/col,midcol=mid%col;
           if(arr[midrow][midcol]==x) return true;
           else if (arr[midrow][midcol]>x) j=mid-1;
           else i=mid+1;
       }
       return false;
    }
}
