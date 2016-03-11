package com.alphalabz.businessapp.Objects;
public class BlogCustomObject {
    private String title, description;
    private int imageResourceID;


    public BlogCustomObject(String title, int imageResourceID,String description) {
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

