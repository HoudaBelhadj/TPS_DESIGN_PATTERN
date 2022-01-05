package com.project.chainCommand;

import com.project.entity.PurchaseRequest;

public class ServiceComptable extends POService{

    @Override
    public void handlePurchaseRequest(PurchaseRequest purchaseRequest) {
        
        if(purchaseRequest.getDepartment().canPurchase(purchaseRequest.getGlobalAmount())){
            purchaseRequest.getDepartment().setBlockedBudget(purchaseRequest.getGlobalAmount());
            System.out.println("First Step Done => " + purchaseRequest.getDepartment().toString());
            this.nextService.handlePurchaseRequest(purchaseRequest);
        }
        else{
            System.out.println("Amount of Purchase request exceeds the budget of Department => Operation Denied");
        }
    }
}
