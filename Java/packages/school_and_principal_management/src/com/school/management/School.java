package com.school.management;

public class School {
    private String name;
    private String location;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String showSchoolInfo() {
        return "School [name=" + name + ", location=" + location + "]";
    }
    
    
}
