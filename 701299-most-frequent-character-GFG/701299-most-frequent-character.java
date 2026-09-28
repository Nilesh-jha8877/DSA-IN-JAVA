class Solution {
    public static char getMaxOccuringChar(String s) {

        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        int n = arr.length;
        int i = 0;
        int maxfreq = 0;
        char ans = arr[0];

        while (i < n) {

            int j = i;

            while (j < n && arr[i] == arr[j]) {
                j++;
            }

            int freq = j - i;

            if (freq > maxfreq) {
                maxfreq = freq;
                ans = arr[i];
            }

            i = j;
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna