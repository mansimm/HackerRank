import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat localPayment; 
        localPayment = NumberFormat.getCurrencyInstance(Locale.US);
        String us = localPayment.format(payment);

        localPayment = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        String india = localPayment.format(payment);

        localPayment = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = localPayment.format(payment);

        localPayment = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = localPayment.format(payment);
        
        

        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
