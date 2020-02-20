import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {

        String firstStringLower = a.toLowerCase();
        String secondStringLower = b.toLowerCase();

        if (firstStringLower.length() == secondStringLower.length()) {
            List<String> firstStringList = new ArrayList<>();
            List<String> secondStringList = new ArrayList<>();


            for (int i = 0; i < firstStringLower.length(); i++) {

                firstStringList.add(firstStringLower.substring(i, i + 1));

            }

            for (int i = 0; i < secondStringLower.length(); i++) {

                secondStringList.add(secondStringLower.substring(i, i + 1));

            }

            Collections.sort(firstStringList);
            Collections.sort(secondStringList);

            int counter = 0;

            for (int i = 0; i < firstStringList.size(); i++) {

                if (firstStringList.get(i).equals(secondStringList.get(i))) {
                    counter++;

                }

            }

            if (firstStringList.size() == counter) {
                return true;

            } else {

                return false;

            }

        }

        return false;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

    }

}
