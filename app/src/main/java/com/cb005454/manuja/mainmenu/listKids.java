package com.cb005454.manuja.mainmenu;

public class listKids {
    String HeadKids;
    String descriptionkids;
    String imageUrlKids;


    public listKids(String headKids, String descriptionkids, String imageUrlKids) {
        HeadKids = headKids;
        this.descriptionkids = descriptionkids;
        this.imageUrlKids = imageUrlKids;
    }

    public String getHeadKids() {
        return HeadKids;
    }

    public void setHeadKids(String headKids) {
        HeadKids = headKids;
    }

    public String getDescriptionkids() {
        return descriptionkids;
    }

    public void setDescriptionkids(String descriptionkids) {
        this.descriptionkids = descriptionkids;
    }

    public String getImageUrlKids() {
        return imageUrlKids;
    }

    public void setImageUrlKids(String imageUrlKids) {
        this.imageUrlKids = imageUrlKids;
    }
}
