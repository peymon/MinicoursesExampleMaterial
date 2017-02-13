/*
Put together a short program that will calculate the tax on the price of three 
items part of a single purchase, respectively priced at 15$, 10$ and 19$, given that
the tax rate is 15%. You can start using the stub below if you aren't sure of how to 
start off. The output of your program should be printed nicely and as a full sentence.

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
        double item1=15;
        double item2=10;
        double item3=19;
        double taxRate = 0.15;
        double tax;
        double totalNoTax;
        double total;
        
        totalNoTax = item1+item2+item3;
        tax = (item1+item2+item3) * taxRate;
        total = totalNoTax+tax;
        
        System.out.println("The total of your purchase is $"+ totalNoTax + 
                ". The tax on your purchase is $" +tax+ 
                ". which makes your total purchase $"+total);
       
    }
    
}
