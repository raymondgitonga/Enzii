package com.tosh.enzii.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class source  {

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("name")
    @Expose
    private String name;


    public source(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
