public class Pattern5 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 5; i > 0; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print((count++) + " ");
            }
            System.out.println();
        }
    }
}
