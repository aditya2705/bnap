package com.alphalabz.businessapp.Objects;

/**
 * Created by Nishita on 21-02-2016.
 */
public class PhotoCategoryObject {
    public String text;
    public int image;

    public PhotoCategoryObject(String text, int image) {
        this.text = text;
        this.image = image;

    }
    public PhotoCategoryObject(int image){
        this.text=null;
        this.image=image;
    }
}
