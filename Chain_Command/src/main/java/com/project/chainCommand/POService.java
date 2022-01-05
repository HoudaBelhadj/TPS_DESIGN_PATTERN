package com.project.chainCommand;

import com.project.entity.PurchaseRequest;

public abstract class POService {
    protected POService nextService;

    public void setNextService(POService nextService){
        this.nextService = nextService;
    }

    public abstract void handlePurchaseRequest(PurchaseRequest purchaseRequest);
}
