package com.company;

import com.company.Controller.Basic_Controllers;
import com.company.Model.Booking_Details;
import com.company.Model.Customer;
import com.company.Model.Taxi;

import java.util.*;

public class Main {

    protected static HashMap<Integer, Taxi> taxiHashMap = new HashMap<Integer, Taxi>();
    public static HashMap<Integer, ArrayList<Taxi>> taxi_Free_map = new HashMap<Integer, ArrayList<Taxi>>();
    static Set<Taxi> set = new HashSet<Taxi>();



    public static void start()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for Call taxi booking ");
        System.out.println("Press 2 for Taxi Details");

        int n = sc.nextInt();
        if(n!=1 && n!=2){
            System.out.println("Please Enter Vaild Number");
            start();
        }

        Basic_Controllers.Request_Handler(n);
        System.out.println();
        start();



    }

    public static void main(String[] args) {

        for (int i =1; i<5; i++){
            Taxi t = new Taxi(i,0,65,0,new ArrayList<Booking_Details>());

            taxiHashMap.put(t.getTaxi_id(),t);

            if (taxi_Free_map.containsKey(t.getPp())){
                taxi_Free_map.get(t.getPp()).add(t);

            }else{
                ArrayList<Taxi> list = new ArrayList<Taxi>();
                list.add(t);
                taxi_Free_map.put(t.getPp(),list);

            }





        }
        //System.out.println(taxi_Free_map.get(65).size());

        //System.out.println(set);





        start();

    }
}
