package com.techelevator;

public class Pizza {
    private String crustType;
    private String size;
    private String[] toppings = {"none"};
    private double price;

    public double getPrice() {
        return price;
    }

    public String getCrustType() {
        return crustType;
    }

    public String getSize() {
        return size;
    }

    public String[] getToppings() {
        return toppings;
    }

    public void setCrustType(String crustType) {
        this.crustType = crustType;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }

    public static final double SMALL_PIZZA_PRICE = 6.99;
    public static final double MEDIUM_PIZZA_PRICE = 8.99;
    public static final double LARGE_PIZZA_PRICE = 10.99;
    public static final double X_LARGE_PIZZA_PRICE = 11.99;
    public static final double JUMBO_PIZZA_PRICE = 13.99;

    public Pizza(String crustType, String size, String[] toppings) {
        this.crustType = crustType;
        this.size = size;
        this.toppings = toppings;
        if (this.size == "small") {
            this.price = SMALL_PIZZA_PRICE;
        }
        if (this.size == "medium") {
            this.price = MEDIUM_PIZZA_PRICE;
        }
        if (this.size == "large") {
            this.price = LARGE_PIZZA_PRICE;
        }
        if (this.size == "x-large") {
            this.price = X_LARGE_PIZZA_PRICE;
        }
        if (this.size == "jumbo") {
            this.price = JUMBO_PIZZA_PRICE;
        }
    }

    public Pizza() {
    }

    public double calculatePrice() {
        double numberOfToppings = getToppings().length;
        if (getCrustType() == "parmesan") {
            this.price += 0.50;
        }
        if (getCrustType() != "parmesan" || getCrustType() != "plain" || getCrustType() != "whole wheat") {
            this.price += 1.00;
        }
        if (numberOfToppings == 8) {
            this.price += 5.00;
            return this.price;

            if (numberOfToppings < 2) {
                this.price += .75 * (numberOfToppings - 2);
            }


        }
    }
}