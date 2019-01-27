package com.cb005454.manuja.mainmenu;

public class listLadies {
    String Head;
    String description;
    String imageUrl;

    public listLadies(String head, String description, String imageUrl) {
        Head = head;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public String getHead() {
        return Head;
    }

    public void setHead(String head) {
        Head = head;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
