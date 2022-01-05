package com.project.chainCommand;

import com.project.entity.PurchaseRequest;

public class ServiceGestionPatrimoine extends POService{

    @Override
    public void handlePurchaseRequest(PurchaseRequest purchaseRequest) {

        // Soustract purchase Amount fro Global Budget of Department
        purchaseRequest.getDepartment().setBudget(purchaseRequest.getDepartment().getBudget() - purchaseRequest.getDepartment().getBlockedBudget());

        // Reset Block Budget to 0
        purchaseRequest.getDepartment().setBlockedBudget(0);

    }
}
