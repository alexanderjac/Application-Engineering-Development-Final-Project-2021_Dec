/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organisation;

import business.roles.Role;
import business.roles.NGOAdminRole;
import java.util.ArrayList;
import business.Organization;

/**
 *
 * @author PRANJAL
 */
public class NGOOrganisation extends Organization {
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> listOfRoles = new ArrayList();
        listOfRoles.add(new NGOAdminRole());
        return listOfRoles;    
    }
    
}
