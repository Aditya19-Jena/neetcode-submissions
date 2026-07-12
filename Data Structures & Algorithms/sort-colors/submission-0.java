class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;

        int arr [] = new int [len];

        int count = 0;
        int n = 0;
        int pos = 0;

        while (n <= 2) {
            for (int i = 0; i < len; i++) {
                if (nums [i] == n) {
                    count += 1;
                }
            }

            for (int i = 0; i < count; i++) {
                arr [pos] = n;
                pos++;
            }

            n += 1;
            count = 0;
        }

        for (int i = 0; i < len; i++) {
            nums [i] = arr [i];
        }
    }
}