package com.alphalabz.businessapp.Objects;

/**
 * Created by SHWETHA on 26-02-2016.
 */
public class VideosCustomObject {


    private String title, description;
    private int imageResourceID;


    public VideosCustomObject(String title, String description, int imageResourceID) {
        this.title = title;
        this.description = description;
        this.imageResourceID = imageResourceID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public void setImageResourceID(int imageResourceID) {
        this.imageResourceID = imageResourceID;
    }
}




