import java.util.Scanner;

public class StringIntroduction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());

        int greaterThan = A.compareTo(B);

        if (greaterThan > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(A.replace(A.charAt(0), A.toUpperCase().charAt(0)) + " " + B.replace(B.charAt(0), B.toUpperCase().charAt(0)));

        sc.close();
    }

}
