package com.cb005454.manuja.mainmenu;

public class MainCart {
    String Price;
    String ItemName;

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public MainCart(String price, String itemName) {
        Price = price;
        ItemName = itemName;
    }


}
