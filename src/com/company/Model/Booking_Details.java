package com.company.Model;

public class Booking_Details {

    int booking_Id;
    int customer_id;
    char from;
    char to;
    int pick_time;
    int drop_time;
    int amount;

    public Booking_Details(int booking_Id, int customer_id, int from, int to, int pick_time, int drop_time, int amount) {
        this.booking_Id=booking_Id;
        this.customer_id = customer_id;
        this.from = (char) from;
        this.to = (char) to;
        this.pick_time = pick_time;
        this.drop_time = drop_time;
        this.amount = amount;
    }

    public int getBooking_Id() {
        return booking_Id;
    }

    public void setBooking_Id(int booking_Id) {
        this.booking_Id = booking_Id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    @Override
    public String toString() {
        return "Booking_Details{" +
                "booking_Id=" + booking_Id +
                ", customer_id=" + customer_id +
                ", from=" + from +
                ", to=" + to +
                ", pick_time=" + pick_time +
                ", drop_time=" + drop_time +
                ", amount=" + amount +
                '}';
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = (char) from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = (char) to;
    }

    public int getPick_time() {
        return pick_time;
    }

    public void setPick_time(int pick_time) {
        this.pick_time = pick_time;
    }

    public int getDrop_time() {
        return drop_time;
    }

    public void setDrop_time(int drop_time) {
        this.drop_time = drop_time;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
