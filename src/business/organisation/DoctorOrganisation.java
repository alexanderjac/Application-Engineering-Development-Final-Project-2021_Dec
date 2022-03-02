/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organisation;

import business.Organization;
import business.roles.DoctorRole;
import business.roles.Role;
import java.util.ArrayList;

/**
 *
 * @author PRANJAL
 */
public class DoctorOrganisation extends Organization {
    
    public DoctorOrganisation() {
        super(Organization.OrganizationType.Doctor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> listOfRoles = new ArrayList();
        listOfRoles.add(new DoctorRole());
        return listOfRoles;
    }
    
}
