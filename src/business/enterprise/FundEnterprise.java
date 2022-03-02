/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.Organization;
import business.organisation.FundRaiserOrganisation;
import business.roles.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PRANJAL
 */
public class FundEnterprise extends Enterprise {
    
     public FundEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.FundRaiser);
    }

    @Override
    public ArrayList<Organization> getSupportedType() {
        ArrayList<Organization> organization = new ArrayList<>();
        organization.add(new FundRaiserOrganisation());
        return organization;
    }
     
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
