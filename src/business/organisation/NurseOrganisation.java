/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organisation;

import java.util.ArrayList;
import business.Organization;
import business.roles.NurseRole;
import business.roles.Role;

/**
 *
 * @author PRANJAL
 */
public class NurseOrganisation extends Organization {
    
    public NurseOrganisation() {
        super(Organization.OrganizationType.Nurse.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> listOfRoles = new ArrayList();
        listOfRoles.add(new NurseRole());
        return listOfRoles;
    }
    
}
