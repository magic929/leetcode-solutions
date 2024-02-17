class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int pre2 = 1;
        int pre1 = 2;
        int cur = 0;
        for (int i = 3;i<=n;i++) {
            cur = pre2 + pre1;
            pre2 = pre1;
            pre1 = cur;
        }
        return cur;
    }
}