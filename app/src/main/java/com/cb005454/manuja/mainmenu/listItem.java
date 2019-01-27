package com.cb005454.manuja.mainmenu;

public class listItem {
    String Head;
    String description;
    String imageUrl;

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

    public listItem(String head, String description, String imageUrl) {
        Head = head;
        this.description = description;
        this.imageUrl = imageUrl;
    }
}
