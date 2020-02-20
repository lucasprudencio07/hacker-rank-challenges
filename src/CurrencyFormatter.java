import java.math.BigDecimal;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double payment = scanner.nextDouble();
        scanner.close();

        BigDecimal value = new BigDecimal(payment);


        Locale brazilLocation = new Locale("pt", "BR");

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String brazil = NumberFormat.getCurrencyInstance(brazilLocation).format(value);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("Brasil: " + brazil);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}
