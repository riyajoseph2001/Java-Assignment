package ControlStructures;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class BillingSystem {
    private String countryName;
    private Locale countryLocale;
    private String customerID;
    private Date billingDate;
    private double amountOutstanding;

    public BillingSystem(String countryName, Locale countryLocale, String customerID, Date billingDate, double amountOutstanding) {
        this.countryName = countryName;
        this.countryLocale = countryLocale;
        this.customerID = customerID;
        this.billingDate = billingDate;
        this.amountOutstanding = amountOutstanding;
    }

    public void displayBillingDetails() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = dateFormat.format(billingDate);

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(countryLocale);
        String formattedAmount = currencyFormat.format(amountOutstanding);

        System.out.println("Customer ID: " + customerID);
        System.out.println("Billing Date: " + formattedDate);
        System.out.println("Country: " + countryName);
        System.out.println("Language: " + countryLocale.getDisplayLanguage());
        System.out.println("Amount Outstanding: " + formattedAmount);
        System.out.println();
    }
}

public class Question12 {
    public static void main(String[] args) {
        Locale usLocale = new Locale("en", "US");
        Locale japanLocale = new Locale("ja", "JP");

        BillingSystem customer1 = new BillingSystem("United States", usLocale, "CUST123", new Date(), 1250.75);
        BillingSystem customer2 = new BillingSystem("Japan", japanLocale, "CUST456", new Date(), 85000.0);

        customer1.displayBillingDetails();
        customer2.displayBillingDetails();
    }
}
