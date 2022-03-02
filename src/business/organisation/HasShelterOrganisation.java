/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organisation;

import business.Organization;
import business.roles.HasShelterRepresentativeRole;
import business.roles.Role;
import java.util.ArrayList;

/**
 *
 * @author PRANJAL
 */
public class HasShelterOrganisation extends Organization {
    
    public HasShelterOrganisation() {
        super(Organization.OrganizationType.HAS_Shelter_Representative.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> listOfRoles = new ArrayList();
        listOfRoles.add(new HasShelterRepresentativeRole());
        return listOfRoles;
    }
    
}
