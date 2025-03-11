import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Currency;

public class SolutionThirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat usFormat=NumberFormat.getCurrencyInstance(Locale.US);
        String u=usFormat.format(payment);

        Locale indiaLocale = new Locale("tr", "IN");
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(indiaLocale);
        symbols.setCurrencySymbol("Rs.");

        DecimalFormat indiaFormat = (DecimalFormat) NumberFormat.getCurrencyInstance(indiaLocale);
        indiaFormat.setDecimalFormatSymbols(symbols);
        String i = indiaFormat.format(payment);

        Locale chinaLocale = Locale.CHINA;
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(chinaLocale);
        chinaFormat.setCurrency(Currency.getInstance("CNY"));
        String c = chinaFormat.format(payment);

        NumberFormat franceFormat=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String f=franceFormat.format(payment);

        System.out.println("US: " + u);
        System.out.println("India: " + i);
        System.out.println("China: " + c);
        System.out.println("France: " + f);
    }
}