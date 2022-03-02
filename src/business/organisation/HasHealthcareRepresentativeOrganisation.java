/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organisation;


import java.util.ArrayList;
import business.roles.Role;
import business.Organization;
import business.roles.HasHealthcareRepresentativeRole;

/**
 *
 * @author PRANJAL
 */
public class HasHealthcareRepresentativeOrganisation extends Organization {
    
    public HasHealthcareRepresentativeOrganisation() {
        super(Organization.OrganizationType.HAS_Healthcare_Representative.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> listOfRoles = new ArrayList();
        listOfRoles.add(new HasHealthcareRepresentativeRole());
        return listOfRoles;
    }
    
}
