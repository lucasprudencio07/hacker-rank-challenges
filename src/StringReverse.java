import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner io = new Scanner(System.in);

        String A = io.next();
        String B = "";

        int StringLength = A.length();

        for (int i = StringLength - 1; i >= 0; i--) {

            B += A.charAt(i);

        }

        if (A.equals(B)) {
            System.out.println("Yes");

        } else {
            System.out.println("No");
        }

    }

}
