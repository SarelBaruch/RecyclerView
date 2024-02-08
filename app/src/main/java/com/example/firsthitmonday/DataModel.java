package com.example.firsthitmonday;

public class DataModel {

    private String name;
    private String version;
    private int image;

    public DataModel(String name, String version, int image) {
        this.name = name;
        this.version = version;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getId_() {
        return id_;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
