package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {

   public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the following info");

        System.out.println("Full Name");
        String name = scanner.nextLine();
        System.out.println("Billing Street");
        String BillingStreet = scanner.nextLine();
        System.out.println("Billing City");
        String BillingCity = scanner.nextLine();
        System.out.println("Billing State");
        String BillingState = scanner.nextLine();
        System.out.println("Billing Zip");
        String BillingZip = scanner.nextLine();


        System.out.println("Shipping Street");
        String ShippingStreet = scanner.nextLine();
        System.out.println("Shipping City");
        String ShippingCity = scanner.nextLine();
        System.out.println("Shipping State");
        String ShippingState = scanner.nextLine();
        System.out.println("Shipping Zip");
        String ShippingZip = scanner.nextLine();

       System.out.println(name);
       StringBuilder BillingAdress = 





















    }

}
