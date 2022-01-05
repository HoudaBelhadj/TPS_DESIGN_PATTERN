package com.project.entity;

import com.project.chainCommand.POService;

import java.util.ArrayList;
import java.util.List;

public class Etablissement {

    private List<Department> departments = new ArrayList<>();
    private List<POService> services = new ArrayList<>();


    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    public void addPOService(POService poService) {
        this.services.add(poService);
    }


}
