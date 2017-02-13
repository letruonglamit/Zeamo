package com.shsl.android.zeamo.view.object;


/**
 * Created by shsl on 09/12/2016.
 */

public class SpinningObj {
    private String name;
    private String location;
    private int review;
    private String address;
    private int imageStudio;

    public SpinningObj(String name, String location, int review, String address, int imageStudio){
        this.name = name;
        this.location = location;
        this.review = review;
        this.address = address;
        this.imageStudio = imageStudio;
    }
    public SpinningObj(){

    }

    public String getName() {
        return name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getImageStudio() {
        return imageStudio;
    }

    public void setImageStudio(int imageStudio) {
        this.imageStudio = imageStudio;
    }
}

