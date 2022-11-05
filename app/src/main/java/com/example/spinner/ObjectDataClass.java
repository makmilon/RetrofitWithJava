package com.example.spinner;

public class ObjectDataClass {

    String resource;
    String id;
    String name;
    String updated_at;


    public ObjectDataClass() {
    }

    public ObjectDataClass(String resource, String id, String name, String updated_at) {
        this.resource = resource;
        this.id = id;
        this.name = name;
        this.updated_at = updated_at;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
