public class Reduce {
    public static void main(String[] args) {
        int count = 100;
        int i = 0;
        while (count > 0) {
            i += 1;
            if (count % 2 == 0) {
                count /= 2;
            } else {
                count -= 1;
            }
        }

        System.out.println(i);
    }
}
