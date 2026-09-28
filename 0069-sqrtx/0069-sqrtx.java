class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;
        long r = x;
        while (r * r > x) {
            r = (r + x / r) / 2;   // Heron's iteration
        }
        return (int) r;
    }
}