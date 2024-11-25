import java.util.*;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        
        // Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
    
        double usdToEur = 0.92;
        double usdToGbp = 0.76;
        double usdToInr = 82.15;
        double eurToUsd = 1.09;
        double eurToGbp = 0.83;
        double eurToInr = 89.32;
        double gbpToUsd = 1.32;
        double gbpToEur = 1.20;
        double gbpToInr = 107.28;
        double inrToUsd = 0.012;
        double inrToEur = 0.011;
        double inrToGbp = 0.0093;

        // Display available currencies
        System.out.println("Available currencies: USD, EUR, GBP, INR");
        
        // Get user input for base currency
        System.out.print("Enter the base currency (USD, EUR, GBP, INR): ");
        String baseCurrency = scanner.next().toUpperCase();
        
        // Get user input for target currency
        System.out.print("Enter the target currency (USD, EUR, GBP, INR): ");
        String targetCurrency = scanner.next().toUpperCase();
        
        // Get the amount to convert
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();
        
        // Perform the conversion
        double convertedAmount = 0;
        
        // Convert based on the selected currencies
        if (baseCurrency.equals("USD")) {
            if (targetCurrency.equals("EUR")) {
                convertedAmount = amount * usdToEur;
            } else if (targetCurrency.equals("GBP")) {
                convertedAmount = amount * usdToGbp;
            } else if (targetCurrency.equals("INR")) {
                convertedAmount = amount * usdToInr;
            }
        } else if (baseCurrency.equals("EUR")) {
            if (targetCurrency.equals("USD")) {
                convertedAmount = amount * eurToUsd;
            } else if (targetCurrency.equals("GBP")) {
                convertedAmount = amount * eurToGbp;
            } else if (targetCurrency.equals("INR")) {
                convertedAmount = amount * eurToInr;
            }
        } else if (baseCurrency.equals("GBP")) {
            if (targetCurrency.equals("USD")) {
                convertedAmount = amount * gbpToUsd;
            } else if (targetCurrency.equals("EUR")) {
                convertedAmount = amount * gbpToEur;
            } else if (targetCurrency.equals("INR")) {
                convertedAmount = amount * gbpToInr;
            }
        } else if (baseCurrency.equals("INR")) {
            if (targetCurrency.equals("USD")) {
                convertedAmount = amount * inrToUsd;
            } else if (targetCurrency.equals("EUR")) {
                convertedAmount = amount * inrToEur;
            } else if (targetCurrency.equals("GBP")) {
                convertedAmount = amount * inrToGbp;
            }
        }
        
       
        if (convertedAmount != 0) {
            System.out.printf("Converted Amount: %.2f %s\n", convertedAmount, targetCurrency);
        } else {
            System.out.println("Invalid currency code entered.");
        }

        
        scanner.close();
    }
}
