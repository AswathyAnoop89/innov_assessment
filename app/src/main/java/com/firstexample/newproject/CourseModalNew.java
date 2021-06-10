package com.firstexample.newproject;

public class CourseModalNew {
    // variables for our course
// name and description.
    private String _id;
    private String name;
    private String lat;
    private String lng;


// creating constructor for our variables.

    public String getId() {
        return _id;
    }

    public CourseModalNew(String _id, String name, String lat, String lng) {
        this._id = _id;
        this.name = name;
        this.lat = lat;
        this.lng = lng;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }
// creating getter and setter methods.

}