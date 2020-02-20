import java.io.*;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateOfWeek {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("dayweek.txt"));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }


    static class Result {

        public static String findDay(int month, int day, int year) {
            LocalDate localDate = LocalDate.of(year, month, day);
            DayOfWeek dayOftheWeek = localDate.getDayOfWeek();
            String dayString = dayOftheWeek.toString();
            return dayString;
        }

    }

}
