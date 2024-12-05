package com.company.Model;

public class Customer {
    int customer_id;
    int pickup_point;
    int drop_point;
    int picktime;

    public Customer(int customer_id,int pickup_point, int drop_point, int picktime) {
        this.customer_id = customer_id;
        this.pickup_point = pickup_point;
        this.drop_point = drop_point;
        this.picktime = picktime;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getPickup_point() {
        return pickup_point;
    }

    public void setPickup_point(int pickup_point) {
        this.pickup_point = pickup_point;
    }

    public int getDrop_point() {
        return drop_point;
    }

    public void setDrop_point(int drop_point) {
        this.drop_point = drop_point;
    }

    public int getPicktime() {
        return picktime;
    }

    public void setPicktime(int picktime) {
        this.picktime = picktime;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", pickup_point=" + pickup_point +
                ", drop_point=" + drop_point +
                ", picktime=" + picktime +
                '}';
    }
}
