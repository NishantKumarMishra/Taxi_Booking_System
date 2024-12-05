package com.company.Controller;

import com.company.Main;
import com.company.Model.Booking_Details;
import com.company.Model.Customer;
import com.company.Model.Taxi;

import java.util.ArrayList;
import java.util.Scanner;

public class Taxi_Booking_Controller extends Main {

    private static Customer customer = null;
    public static int Booking_count = 0;


/// Searching for taxi in given pickup point and at given pickup time
    public static Taxi search(int pp, int pt){
        Taxi temp=null;
        int ind=-1;
        if (taxi_Free_map.containsKey(pp)){
            temp=taxi_Free_map.get(pp).get(0);
            ind = 0;
            for(int i =0; i<taxi_Free_map.get(pp).size(); i++){
                Taxi t = taxi_Free_map.get(pp).get(i);
                if(t.getPt()<=pt && t.getTotal_earning()<temp.getTotal_earning()){
                    temp = t;
                    ind = i;
                }


            }

        }
        if(ind!=-1){
            taxi_Free_map.get(pp).remove(temp);
        }
        return temp;

    }

    public static void Update_module(Booking_Details booking_details,Taxi taxi){

        taxi.getList().add(booking_details);
        taxi.setPp(booking_details.getTo());
        taxi.setPt(booking_details.getDrop_time());
        taxi.setTotal_earning(taxi.getTotal_earning()+booking_details.getAmount());

        int pp = taxi.getPp();
        //System.out.println(  taxi.getList().toString());

        if(taxi_Free_map.containsKey(pp)){
            taxi_Free_map.get(pp).add(taxi);
        }else {
            ArrayList<Taxi> list =new ArrayList<Taxi>();
            list.add(taxi);
            taxi_Free_map.put(pp,list);
        }




    }

    public static Booking_Details book_details(){

        int pp = customer.getPickup_point();
        int dp = customer.getDrop_point();
        int pt = customer.getPicktime();
        int total_dist = (dp-pp)*15;
        int droptime = pt+(dp-pp);
        int amount = 100+((total_dist-5)*10);

        Booking_Details booking_details = new Booking_Details(Booking_count+1, customer.getCustomer_id(), customer.getPickup_point(),
                customer.getDrop_point(), customer.getPicktime(), droptime,amount);
        Booking_count = Booking_count+1;
        return booking_details;


    }

 // Booking taxi --------------

    public static void book_Taxi(){


        take_user();
        if (customer==null){
            return;
        }


       System.out.println();

        System.out.println("Taxi can be allotted...");
        Taxi taxi = search(customer.getPickup_point(),customer.getPicktime());
        //System.out.println("hai ki nhi "+taxi_Free_map.get(customer.getPickup_point()).size());
        Booking_Details booking_details;
        if(taxi!=null){
            System.out.println("Taxi-"+taxi.getTaxi_id()+" is allotted");
            booking_details = book_details();
            Update_module(booking_details,taxi);
        }else{
            System.out.println("Booking Rejected");
        }






    }

 // Taking user ----------------------

    public static void take_user()
    {


  // Taking User Details for booking-----------------
       try {
           Scanner sc = new Scanner(System.in);

           System.out.println("Customer ID");
           int ci = sc.nextInt();

           System.out.println("Pickup Point");
           String pp = sc.next();
           pp = pp.toUpperCase();
           int pickup =(int)(pp.charAt(0));

           System.out.println("Drop point");
           String dp = sc.next();
           dp = dp.toUpperCase();
           int drop =(int)(dp.charAt(0));

           System.out.println("Pick up time");
           int time = sc.nextInt();

           customer = new Customer(ci,pickup,drop,time);

       }catch (Exception e){
           System.out.println("Please Enter Valid Input");
       }
       return;



    }
}
