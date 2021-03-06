package com.example.aale.model;

public class Swipe {
    private String swipe_id;
    //person who swiped
    private Customer swiped_by;
    // swiped person
    private Customer swiped;
    private String swiped_date;
    private String swiped_time;
    private String swipe_type;
    private boolean seen_status;

    public Swipe() {
    }

    public String getSwipe_id() {
        return swipe_id;
    }

    public void setSwipe_id(String swipe_id) {
        this.swipe_id = swipe_id;
    }



    public String getSwiped_date() {
        return swiped_date;
    }

    public void setSwiped_date(String swiped_date) {
        this.swiped_date = swiped_date;
    }

    public String getSwiped_time() {
        return swiped_time;
    }

    public void setSwiped_time(String swiped_time) {
        this.swiped_time = swiped_time;
    }

    public String getSwipe_type() {
        return swipe_type;
    }

    public void setSwipe_type(String swipe_type) {
        this.swipe_type = swipe_type;
    }

    public boolean isSeen_status() {
        return seen_status;
    }

    public void setSeen_status(boolean seen_status) {
        this.seen_status = seen_status;
    }






}
