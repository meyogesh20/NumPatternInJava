public class Pattern8 {
    public static void main(String[] args) {
        for (char i = 'E'; i >= 'A'; i--) {
            for (char ch = i; ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
