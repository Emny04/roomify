package com.roomify.roomify;

import lombok.Getter;

public class SurveyResponse {
    @Getter
    private String bedSize; // Queen or King
    @Getter
    private boolean hasTV;
    @Getter
    private int budget; // Low, Medium, High
    @Getter
    private String theme; // Black or White
    
    public void setBedSize(String bedSize){
        this.bedSize = bedSize;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public void setHasTV(boolean hasTV) {
        this.hasTV = hasTV;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

}

