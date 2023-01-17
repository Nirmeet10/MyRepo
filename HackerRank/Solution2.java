
import java.text.NumberFormat;
import java.util.Locale;
import java.io.*;

public class Solution2 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double payment = Double.parseDouble(br.readLine());

        Locale usLocale = new Locale("en", "US");
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(usLocale);
        String us = usFormat.format(payment);

        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        String india =   indiaFormat.format(payment);

        Locale chinaLocale = Locale.CHINA;
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(chinaLocale);
        String china = chinaFormat.format(payment);

        Locale franceLocale = Locale.FRANCE;
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(franceLocale);
        String france = franceFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

