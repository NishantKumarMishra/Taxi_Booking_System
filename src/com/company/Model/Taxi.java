package com.company.Model;

import java.util.ArrayList;

public class Taxi {
    int Taxi_id;
    int total_earning;
    int pp;
    int pt;
    ArrayList<Booking_Details> list;

    public Taxi(int taxi_id, int total_earning, int pp, int pt, ArrayList<Booking_Details> list) {
        Taxi_id = taxi_id;
        this.total_earning = total_earning;
        this.pp = pp;
        this.pt = pt;
        this.list = list;
    }

    public int getTaxi_id() {
        return Taxi_id;
    }

    public void setTaxi_id(int taxi_id) {
        Taxi_id = taxi_id;
    }

    public int getTotal_earning() {
        return total_earning;
    }

    public void setTotal_earning(int total_earning) {
        this.total_earning = total_earning;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public int getPt() {
        return pt;
    }

    public void setPt(int pt) {
        this.pt = pt;
    }

    public ArrayList<Booking_Details> getList() {
        return list;
    }

    public void setList(ArrayList<Booking_Details> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "Taxi_id=" + Taxi_id +
                ", total_earning=" + total_earning +
                ", pp=" + pp +
                ", pt=" + pt +
                ", list=" + list +
                '}';
    }
}
