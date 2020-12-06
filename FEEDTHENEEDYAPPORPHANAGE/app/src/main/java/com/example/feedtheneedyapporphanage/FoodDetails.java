package com.example.feedtheneedyapporphanage;

public class FoodDetails {
    String foodName;
    String foodType;
    String foodQuantity;
    String prepTime;

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getFoodQuantity() {
        return foodQuantity;
    }

    public void setFoodQuantity(String foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public String getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(String prepTime) {
        this.prepTime = prepTime;
    }

    public FoodDetails(String foodName, String foodType, String foodQuantity, String prepTime) {
        this.foodName = foodName;
        this.foodType = foodType;
        this.foodQuantity = foodQuantity;
        this.prepTime = prepTime;
    }
}


