public class Pattern12 {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i < 5; i++) {
            int start = num;
            for (int j = 1; j <= i; j++) {
                System.out.print(++num + "  ");
            }
            int end = num;
            for (; end > 1 && end > start ; end--) {
                System.out.print((end) + "  ");
            }
            System.out.println();
        }
    }
}
