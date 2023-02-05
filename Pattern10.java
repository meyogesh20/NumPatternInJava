
public class Pattern10 {

    public static void main(String[] args) {
        boolean flag = true;
        for (int i = 5; i > 0; i--) {
            for (int j = 5; j >= i; j--) {
                if (flag) {
                    System.out.print(1);
                    flag = false;
                } else
                    {
                        System.out.print(0);
                        flag = true;
                    }
            }
            System.out.println();
        }
    }
}