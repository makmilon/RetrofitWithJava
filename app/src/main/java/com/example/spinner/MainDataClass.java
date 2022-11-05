package com.example.spinner;

import java.util.List;

public class MainDataClass {

    List<ObjectDataClass> data;

    public MainDataClass() {
    }

    public MainDataClass(List<ObjectDataClass> data) {
        this.data = data;
    }

    public List<ObjectDataClass> getData() {
        return data;
    }

    public void setData(List<ObjectDataClass> data) {
        this.data = data;
    }
}
