class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int majority = 0;

        for (int i = 0; i < len; i++) {
            int count = 0;

            int x = nums [i];

            for (int j = 0; j < len; j++) {
                if (nums [j] == x) {
                    count++;
                }
            }

            if (count > len/2) {
                majority = nums [i];
            }
        }

        return majority;
    }
}