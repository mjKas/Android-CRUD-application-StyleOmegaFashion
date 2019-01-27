package com.cb005454.manuja.mainmenu;

public class GentsList {
    String HeadGents;
    String descriptionGents;
    String imageUrlGents;

    public GentsList(String headGents, String descriptionGents, String imageUrlGents) {
        HeadGents = headGents;
        this.descriptionGents = descriptionGents;
        this.imageUrlGents = imageUrlGents;
    }

    public String getHeadGents() {
        return HeadGents;
    }

    public void setHeadGents(String headGents) {
        HeadGents = headGents;
    }

    public String getDescriptionGents() {
        return descriptionGents;
    }

    public void setDescriptionGents(String descriptionGents) {
        this.descriptionGents = descriptionGents;
    }

    public String getImageUrlGents() {
        return imageUrlGents;
    }

    public void setImageUrlGents(String imageUrlGents) {
        this.imageUrlGents = imageUrlGents;
    }
}
