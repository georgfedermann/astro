package com.sneaky.astro.json;

public class Assignment {
    private String name;
    private String craft;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCraft() {
        return craft;
    }

    public void setCraft(String craft) {
        this.craft = craft;
    }

    public String toString() {
        return String.format("%s aboard %s", name, craft);
    }
}
