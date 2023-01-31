class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long massL = mass;
        for (int ast : asteroids) {
            if (ast > massL) {
                return false;
            }
            massL += ast;
        }
        return true;
    }
}
