import java.util.Scanner;

public class JavaSubstring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        int realEnd = end - 1;


        for (int cont = 0; cont < S.length(); cont++) {
            if (cont >= start && cont <= realEnd) {
                System.out.print(S.charAt(cont));
            }
        }

    }
}
