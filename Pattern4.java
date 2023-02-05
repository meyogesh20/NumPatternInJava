public class Pattern4 {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            int j = i;
            for (; j < 5; j++) {
                System.out.print(j);
            }
            for (j = i; j > 0; j--) {
                System.out.print("5");
            }
            System.out.println();
        }
    }
}
