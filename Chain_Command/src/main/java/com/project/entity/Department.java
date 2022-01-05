package com.project.entity;

public class Department {

    private double budget;
    private double blockedBudget;

    public PurchaseRequest createPurchaseRequest(double amount) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(amount);
        purchaseRequest.setDepartment(this);
        return purchaseRequest;
    }

    // Methode to compare between budget of Department and Amount of Purchase Request
    public boolean canPurchase(double amount){
        return budget >= amount;
    }

    public double getBudget() {
        return budget;
    }

    public double getBlockedBudget() {
        return blockedBudget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void setBlockedBudget(double blockedBudget) {
        this.blockedBudget = blockedBudget;
    }

    @Override
    public String toString() {
        return "Department{" +
                "budget=" + budget +
                ", blockedBudget=" + blockedBudget +
                '}';
    }
}
