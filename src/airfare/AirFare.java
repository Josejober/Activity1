package airfare;

import java.util.Scanner;

public class AirFare {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float result = 0;
        float discount;

        System.out.print("Distance ( in km ) : ");
        int distance = input.nextInt();

        System.out.print("Class ( 1 or 2 ) : ");
        int cass = input.nextInt();

        if( cass == 1 ) {

            result = 250 * distance;

            if( distance >= 1000 ) {
                discount = result * ( float ) 0.1;
                result = result - discount;
            }

            System.out.print("Total fare : Rs." + result );

        } else if( cass == 2 ) {

            result = 500 * distance;

            if( distance >= 1000 ) {
                discount = result * ( float ) 0.1;
                result = result - discount;
            }

            System.out.print("Total fare : Rs." + result );

        } else {
            System.out.println("Invalid Class");
        }
    }
}