package Utilities;

import java.time.LocalDate;

public class TimeHandler {
//    public String StartDate;


    public static String TravelDate(int FutureDateCount) {


        LocalDate futureDate = LocalDate.now().plusDays(Long.parseLong(String.valueOf(FutureDateCount)));
        System.out.println("Booking Date is : " + futureDate);
        String StartDate = futureDate.toString();


        return StartDate;
    }

}

