/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organisation;

import business.Organization;
import business.roles.AdultCareRole;
import business.roles.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PRANJAL
 */
public class AdultCareOrganisation extends Organization {
    
    public AdultCareOrganisation() {
        super(Organization.OrganizationType.AdultCare.getValue());
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> listOfRoles = new ArrayList();
        listOfRoles.add(new AdultCareRole());
        return listOfRoles;
    }
    
}
