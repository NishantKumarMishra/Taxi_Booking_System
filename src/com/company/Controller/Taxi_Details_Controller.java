package com.company.Controller;

import com.company.Main;
import com.company.Model.Taxi;

public class Taxi_Details_Controller extends Main {

   public static void Display_Taxi(){

       for(Taxi t : taxiHashMap.values()){
           if(t.getList().size()>0){

               System.out.println("Taxi - " + t.getTaxi_id() + "      "+"Total Earnings: Rs." + " "+ t.getTotal_earning());
               System.out.println();

               for (int i =0; i<t.getList().size(); i++){
                   System.out.println(t.getList().get(i).toString());
               }
               System.out.println();


           }
       }
       return;

   }
}
