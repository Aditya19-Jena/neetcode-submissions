class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        int dummy [] = new int [n];

        if (n == 0) {
            return false;
        }

        dummy [0] = nums [0];

        for (int i = 1; i < n; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (dummy [j] == nums [i]) {
                    return true;
                }
            }

            dummy [i] = nums [i];
        }

        return false;
    }
}