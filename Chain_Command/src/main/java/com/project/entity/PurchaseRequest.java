package com.project.entity;

public class PurchaseRequest {

    private double globalAmount;
    private Department department;

    public PurchaseRequest(double amount) {
        this.globalAmount = amount;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getGlobalAmount() {
        return globalAmount;
    }

    public Department getDepartment() {
        return department;
    }
}
