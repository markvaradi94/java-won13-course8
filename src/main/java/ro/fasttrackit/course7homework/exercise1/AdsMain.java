package ro.fasttrackit.course7homework.exercise1;

import java.util.Scanner;

public class AdsMain {
    public static void main(String[] args) {
//        AdProvider adProvider;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Choose your advertising: ");
//        String adType = scanner.nextLine();
//
//        switch (adType.toLowerCase()) {
//            case "facebook" -> adProvider = new Facebook();
//            case "email" -> adProvider = new Email();
//            default -> adProvider = new Print();
//        }
//
//        adProvider.advertise("Buy this shiny new thing please");


        System.out.println("==============================================");

        AdvertisingAgency agency = new AdvertisingAgency();
        agency.setContent("Buy this shiny new thing please");
        agency.setClients(new String[]{"Gicu", "Horatiu"});
        agency.setAdProviders(new AdProvider[]{new Facebook(), new Email(), new Print()});

        agency.runAds();
    }
}
