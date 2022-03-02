package business.network;

import business.enterprise.Enterprise;
import business.enterprise.EnterpriseDirectory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacksonalexander
 */
public class Network {
    
    private String name;
    private EnterpriseDirectory enterpriseDirectory;

    public Network(String name) {
        this.name = name;
    }

    public Network() {
        enterpriseDirectory=new EnterpriseDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void updateEnterprise(Enterprise enterprise, String updatedName) {
        for (Enterprise ent : this.enterpriseDirectory.getListOfEnterprises()) {
            if (ent.equals(enterprise)) {
                ent.setOrganizationName(updatedName);
            }
        }
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
