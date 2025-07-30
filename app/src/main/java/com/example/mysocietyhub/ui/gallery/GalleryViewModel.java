package com.example.mysocietyhub.ui.gallery;

public class GalleryViewModel  {



    String name,image;

    public GalleryViewModel() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public GalleryViewModel(String name, String image) {
        this.name = name;
        this.image = image;
    }
}