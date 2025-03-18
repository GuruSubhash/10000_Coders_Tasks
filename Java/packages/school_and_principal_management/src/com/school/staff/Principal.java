package com.school.staff;

public class Principal {
    private int experienceYears;
    private String principalName;
    public int getExperienceYears() {
        return experienceYears;
    }
    public String showPrincipalInfo() {
        return "Principal [experienceYears=" + experienceYears + ", principalName=" + principalName + "]";
    }
    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }
    public String getPrincipalName() {
        return principalName;
    }
    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }
    
}
