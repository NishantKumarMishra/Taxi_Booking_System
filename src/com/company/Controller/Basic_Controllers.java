package com.company.Controller;

public class Basic_Controllers {

    public static void  Request_Handler(int n)
    {
        System.out.println();
        if(n==1)
        {
            Taxi_Booking_Controller.book_Taxi();

        }else if (n==2){
            Taxi_Details_Controller.Display_Taxi();


        }
    }
}
