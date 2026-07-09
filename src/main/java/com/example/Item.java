package com.example;

public class Item {

    private int price;
    private ItemState state;

    public Item(int price) {
        this.price = price;
        this.state = new ItemState(price);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void save() {
        this.state.setState(this.price);
    }

    public void undo() {
        this.price = state.getState();
    }

}
