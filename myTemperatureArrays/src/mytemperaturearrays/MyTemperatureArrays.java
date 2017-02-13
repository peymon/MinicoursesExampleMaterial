/*
 * build a program that will convert the temperatures given in the `celsius` 
 *array into Kelvin and Fahrenheit degrees. Make sure to store your results in
 *arrays as well. The position of an element in the `celsius` array should match 
 *the position of its equivalents in the other arrays.

 */
package mytemperaturearrays;

/**
 *
 * @author peyyyyyy
 */
public class MyTemperatureArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] celsius = {26.5, 10.0, 0.0, 65};
        double[] kelvin = new double[4];
        double[] fahrenheit = new double[4];
        double k_rate = 273.15;
        
        //to calculate Kelvin:
        for (int i=0; i<celsius.length;i++){
           
            kelvin[i]= celsius[i]+k_rate;
            System.out.println(celsius[i] + " Celcius is equal to " + kelvin[i] + " Kelvin");
        }
        
        System.out.println("\n");
        //to calculate Fahrenheit:
         for (int j=0; j<celsius.length;j++){
           
            fahrenheit[j]= celsius[j]* 9/5 +32;
            System.out.println(celsius[j] + " Celcius is equal to " + fahrenheit[j] + " Fahrenheit");
        }
        
    }
    
}
