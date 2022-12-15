package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int toppingsPrice;
    private int paperBagPrice;
    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isPaperBagAdded;
    boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        this.cheesePrice = 80;
        this.paperBagPrice = 20;

        if(isVeg){
            this.price = 300;
            this.toppingsPrice = 70;
        }
        else{
            this.price = 400;
            this.toppingsPrice = 120;
        }

        this.isCheeseAdded = false;
        this.isToppingsAdded = false;
        this.isPaperBagAdded = false;
        this.isBillGenerated = false;

        this.bill ="Base Price Of The Pizza: " + this.price + "\n" ;

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(isCheeseAdded == false){
            this.price = this.price + cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(isToppingsAdded == false){
            this.price = this.price + toppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(isPaperBagAdded==false){
            this.price = this.price + paperBagPrice;
            isPaperBagAdded = true;
        }
    }

    public String getBill(){
        if(isBillGenerated == false){

            if(isCheeseAdded == true){
                this.bill = this.bill+"Extra Cheese Added: " + this.cheesePrice + "\n";

            }
            if(isToppingsAdded == true){
                this.bill = this.bill + "Extra Toppings Added: " + this.toppingsPrice + "\n";
            }
            if(isPaperBagAdded == true){
                this.bill = this.bill+ "Paperbag Added: " + this.paperBagPrice + "\n";
            }
            this.bill = this.bill + "Total Price: " + this.price + "\n";

            isBillGenerated = true;
        }
        return this.bill;
    }
}
