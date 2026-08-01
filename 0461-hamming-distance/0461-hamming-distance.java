class Solution {
    public int hammingDistance(int x, int y) {
        int count=x^y;
        return Integer.bitCount(count);
    }
}