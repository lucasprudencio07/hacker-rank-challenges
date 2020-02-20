import java.util.*;

public class StringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        List<String> subStringList = new ArrayList<>();

        int correctedSize = s.length() - (k - 1);

        for (int cont = 0; cont < correctedSize; cont++) {

            String subString = s.substring(cont, cont + k);
            subStringList.add(subString);

        }

        Collections.sort(subStringList);

        smallest = subStringList.get(0);
        largest = subStringList.get(subStringList.size() - 1);

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
