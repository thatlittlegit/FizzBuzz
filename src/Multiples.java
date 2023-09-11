public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiplesBelow(1000, new int[] { 3, 5 }));
    }

    private static int multiplesBelow(int limit, int[] factors) {
        int count = 0;
        for (int i = 1; i < limit; i++) {
            count += isMultiple(i, factors) ? 1 : 0;
        }

        return count;
    }

    private static boolean isMultiple(int i, int[] factors) {
        for (int factor : factors) {
            if (i % factor == 0) {
                return true;
            }
        }

        return false;
    }
}
