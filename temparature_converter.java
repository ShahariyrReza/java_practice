
package mycompany.myproject1;

import java.util.Scanner;

/**
 *
 * @author shahariyr reza
 */
public class temparature_converter {
    public static void main(String[] args) {
        
        System.out.println("For Celcious to Farenhight press 1");
        System.out.println("For Celcious to Kelvin     press 2");
        System.out.println("For Farenhight to Celcious press 3");
        System.out.println("For Farenhight to Kelvin   press 4");
        System.out.println("For Kelvin to Celcious     press 5");
        System.out.println("For Kelvin to farenhight   press 6");
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x=1) {
            System.out.println("Enter the Celcious value :");
            Scanner cel = new Scanner(System.in);
            double d = cel.nextDouble();
            d = 1.8*d;
            System.out.println("Farenhight value is :"+d);
        } else {
        }
    }
}
