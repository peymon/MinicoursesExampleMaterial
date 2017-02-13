/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxcalculations;

/**
 *
 * @author peyyyyyy
 */
public class TaxCalculations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double price1 = 15;
    double price2 = 10;
    double price3 = 19;
    double taxRate = 0.15;
    double totalNoTax;
    double totalIncTax;
    
    totalNoTax = price1+price2+price3;
    
    totalIncTax = totalNoTax * (1+taxRate);
    
    System.out.println("Purchases amount to $"+totalNoTax+" before tax, and to $"+totalIncTax+" after tax,");
    
    
    }
    
}
