class Solution {
    public int[] twoSum(int[] arr, int tar) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] + arr[j] == tar) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }
}