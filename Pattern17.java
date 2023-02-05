public class Pattern17 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            int k = i;
            for (; k >= 1; k--) {
                System.out.print(k);
            }
            int l = k + 2;
            for (; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
