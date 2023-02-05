public class Pattern13 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            int j = i + 1;
            for (; j < 5; j++) {
                System.out.print(j);
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
