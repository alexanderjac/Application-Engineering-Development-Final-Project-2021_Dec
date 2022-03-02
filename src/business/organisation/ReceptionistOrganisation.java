/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organisation;

import java.util.ArrayList;
import business.Organization;
import business.roles.Role;
import business.roles.ReceptionistRole;

/**
 *
 * @author PRANJAL
 */
public class ReceptionistOrganisation extends Organization {
    
    public ReceptionistOrganisation() {
        super(Organization.OrganizationType.Receptionist.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> listOfRoles = new ArrayList();
        listOfRoles.add(new ReceptionistRole());
        return listOfRoles;
    }
    
}
