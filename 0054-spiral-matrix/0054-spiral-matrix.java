class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
     List<Integer> ans=new ArrayList<>();
     int m=arr.length,n=arr[0].length;
     int firstrow=0,lastrow=m-1,firstcol=0,lastcol=n-1;
     while(firstrow<=lastrow && firstcol<=lastcol){
         for(int j=firstcol;j<=lastcol;j++){
             ans.add(arr[firstrow][j]);
         }
         firstrow++;
         if(firstrow>lastrow || firstcol>lastcol) break;
         for(int i=firstrow;i<=lastrow;i++){
             ans.add(arr[i][lastcol]);
         }
          lastcol--;
         if(firstrow>lastrow || firstcol>lastcol) break;
         for(int j=lastcol;j>=firstcol;j--){
             ans.add(arr[lastrow][j]);
         }
          lastrow--;
         if(firstrow>lastrow || firstcol>lastcol) break;
         for(int i=lastrow;i>=firstrow;i--){
             ans.add(arr[i][firstcol]);
         }
           firstcol++;
     }
     return ans;
    }
}