package com.project;

import com.project.chainCommand.POService;
import com.project.chainCommand.ServiceComptable;
import com.project.chainCommand.ServiceGestionPatrimoine;
import com.project.entity.Department;
import com.project.entity.Etablissement;
import com.project.entity.PurchaseRequest;

public class App {

    public static void main(String[] args) {
        // La creation de la chaine de commandes : ==> Step 1
        POService serviceComptable = new ServiceComptable();
        POService serviceGP = new ServiceGestionPatrimoine();
        serviceComptable.setNextService(serviceGP);


        // Create Etablissement And Department
        Department department = new Department();
        department.setBudget(30000);
        department.setBlockedBudget(0);
        Etablissement etablissement = new Etablissement();
        etablissement.addDepartment(department);
        etablissement.addPOService(serviceComptable);
        etablissement.addPOService(serviceGP);

        // Create a new Purchase Request that must be handled by handlers (Services)
        PurchaseRequest purchaseRequest = department.createPurchaseRequest(40000);

        // Handle the request
        System.out.println(department.toString());
        System.out.println("==============================");
        serviceComptable.handlePurchaseRequest(purchaseRequest);
        System.out.println("==============================");
        System.out.println(department.toString());


    }
}
