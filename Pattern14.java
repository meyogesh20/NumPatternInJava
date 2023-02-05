public class Pattern14 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int j = 1;
            for (; j <= i; j++) {
                System.out.print(j);
                if (j < i) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
