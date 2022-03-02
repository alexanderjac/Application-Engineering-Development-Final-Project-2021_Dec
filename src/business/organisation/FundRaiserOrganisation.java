/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organisation;

import business.roles.GeneralRole;
import business.roles.CorporateRole;
import business.roles.FundAdminRole;
import java.util.ArrayList;
import business.roles.Role;
import business.Organization;

/**
 *
 * @author PRANJAL
 */
public class FundRaiserOrganisation extends Organization {
    
    public FundRaiserOrganisation() {
        super(Organization.OrganizationType.Fundrasier.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> listOfRoles = new ArrayList();
        listOfRoles.add(new FundAdminRole());
        listOfRoles.add(new CorporateRole());
        listOfRoles.add(new GeneralRole());
        return listOfRoles;
    }
    
}
