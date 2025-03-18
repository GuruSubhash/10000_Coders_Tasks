package com.school.app;

import com.school.management.School;
import com.school.staff.Principal;

public class SchoolApp {
    public static void main(String[] args) {
        School sch= new School();
        sch.setName("Vikas Model High School");
        sch.setLocation("Penamaluru, Vijayawada");
        
        Principal p = new Principal();
        p.setExperienceYears(30);
        p.setPrincipalName("Nanda Sir");

        System.out.println(sch.showSchoolInfo());
        System.out.println(p.showPrincipalInfo());
        
    }
    
}
