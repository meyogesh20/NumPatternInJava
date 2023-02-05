public class Pattern16 {
    public static void main(String[] args) {
        for (int i = 'A'; i < 'E'; i++) {
            // for (int j = 'E'; j > i; j--) {
            // System.out.print(" ");
            // }
            int k = 'A';
            for (; k <= i; k++) {
                System.out.print((char) k);
            }
            int l = --k - 1; //
            for (; l >= 'A'; l--) {
                System.out.print((char) l);
            }
            System.out.println();
        }
    }
}
