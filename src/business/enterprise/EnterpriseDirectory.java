/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PRANJAL
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> listOfEnterprises;

    public EnterpriseDirectory() {
        listOfEnterprises = new ArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getListOfEnterprises() {
        return listOfEnterprises;
    }

    public void setListOfEnterprises(ArrayList<Enterprise> listOfEnterprises) {
        this.listOfEnterprises = listOfEnterprises;
    }
    
    

//    public List<Enterprise> getEnterpriseList() {
//        return listOfEnterprises;
//    }
//
//    public void setEnterpriseList(List<Enterprise> enterpriseList) {
//        this.enterpriseList = enterpriseList;
//    }

    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Hospital) {
            enterprise = new HospitalEnterprise(name);
            listOfEnterprises.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.NGO) {
            enterprise = new NGOEnterprise(name);
            listOfEnterprises.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.FundRaiser) {
            enterprise = new FundEnterprise(name);
            listOfEnterprises.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.Volunteer) {
            enterprise = new PersonEnterprise(name);
            listOfEnterprises.add(enterprise);
        }
        return enterprise;
    }

    public Enterprise removeEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = fetchEnterprise(name, type);
        if (type == Enterprise.EnterpriseType.Hospital) {
            System.out.println("check3");
            for(Enterprise e: listOfEnterprises) {
                System.out.println(e.getOrganizationName());
            }
            listOfEnterprises.remove(enterprise);
            System.out.println("--------------");
            for(Enterprise e: listOfEnterprises) {
                System.out.println(e.getOrganizationName());
            }
        }
        if (type == Enterprise.EnterpriseType.Volunteer) {
            System.out.println("check3");
            for(Enterprise e: listOfEnterprises) {
                System.out.println(e.getOrganizationName());
            }
            listOfEnterprises.remove(enterprise);
            System.out.println("--------------");
            for(Enterprise e: listOfEnterprises) {
                System.out.println(e.getOrganizationName());
            }
        }
        if (type == Enterprise.EnterpriseType.FundRaiser) {
            enterprise = new PersonEnterprise(name);
            listOfEnterprises.remove(enterprise);
        }
        return enterprise;
    }

    public Enterprise fetchEnterprise(String name, Enterprise.EnterpriseType type) {
        for (Enterprise enterprise : listOfEnterprises) {
            System.out.println("check4 "+enterprise.getEnterpriseType());
            if (enterprise.getOrganizationName().equals(name) && enterprise.getEnterpriseType().equals(type.toString())) {
                return enterprise;
            }
            
        }
        return null;
    }

}
