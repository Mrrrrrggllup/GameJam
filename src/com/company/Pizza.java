package com.company;

import java.util.ArrayList;

public class Pizza {
    private ArrayList ingredients = new ArrayList<>();




    public ArrayList getIngredients() {
        return ingredients;
    }
    public void setIngredients(String ingredients) {

        this.ingredients.add(ingredients);
    }




}
