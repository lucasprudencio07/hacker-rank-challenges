import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BigDecimalSort {




    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String []s = new String[n + 2];

        Map<String, BigDecimal> numbersMap = new HashMap<>();

        for(int i = 0; i < n; i++) {

            s[i] = sc.next();

//            numbersMap.add(BigDecimal.valueOf(Double.parseDouble(s[i])));
            numbersMap.put(s[i], BigDecimal.valueOf(Double.parseDouble(s[i])));

        }

        sc.close();


        int listLength = numbersMap.size();

        Stream<Map.Entry<String, BigDecimal>> sortedMap = numbersMap.entrySet().stream().sorted(Map.Entry.comparingByValue());

        List<Map.Entry<String, BigDecimal>> sortedList = sortedMap.collect(Collectors.toList());
        sortedList.forEach(a -> System.out.println(a.getKey()));

//        for (int i = 0; i < listLength; i++) {
//            for (int j = 0; j < (listLength - i - 1); j++) {
//                if (numbersMap.get(j).compareTo(numbersMap.get(j + 1)) > 0) {

//                    BigDecimal aux = numbersMap.get(j);
//                    numbersMap.set(j, numbersMap.get(j + 1));
//                    numbersMap.set(j + 1, aux);
;

//                }
//
//            }
//
//        }

//        for(int i = 0; i < n; i++) {
//
//            System.out.println(s[i]);
//
//        }

//        System.out.println(sortedMap);

    }

}
