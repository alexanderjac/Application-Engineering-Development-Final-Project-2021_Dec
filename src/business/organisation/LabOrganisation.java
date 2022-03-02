/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organisation;

import business.Organization;
import business.roles.LabAssistantRole;
import business.roles.Role;
import java.util.ArrayList;

/**
 *
 * @author PRANJAL
 */
public class LabOrganisation extends Organization {
    
    public LabOrganisation() {
        super(Organization.OrganizationType.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> listOfRoles = new ArrayList();
        listOfRoles.add(new LabAssistantRole());
        return listOfRoles;
    }
    
}
