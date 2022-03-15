package edu.iuh.bai4_desginiu;

public class ElectricThing {
    private String name;
    private int rate;
    private int newPrice;
    private int peopleRate;
    private int imageThing;
    private int reducePrencet;

    public ElectricThing(String name, int rate, int newPrice, int peopleRate, int imageThing, int reducePrencet) {
        this.name = name;
        this.rate = rate;
        this.newPrice = newPrice;
        this.peopleRate = peopleRate;
        this.imageThing = imageThing;
        this.reducePrencet = reducePrencet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(int newPrice) {
        this.newPrice = newPrice;
    }

    public int getPeopleRate() {
        return peopleRate;
    }

    public void setPeopleRate(int peopleRate) {
        this.peopleRate = peopleRate;
    }

    public int getImageThing() {
        return imageThing;
    }

    public void setImageThing(int imageThing) {
        this.imageThing = imageThing;
    }

    public int getReducePrencet() {
        return reducePrencet;
    }

    public void setReducePrencet(int reducePrencet) {
        this.reducePrencet = reducePrencet;
    }
}
