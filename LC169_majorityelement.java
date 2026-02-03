class Solution {
    public int majorityElement(int[] nums) {
        int can = 0;
        int coun = 0;

    for (int num : nums) {

        if (coun == 0) {
            can = num;
        }

        if (num == can)
            coun++;
        else
            coun--;
    }

    return can;
    }
}