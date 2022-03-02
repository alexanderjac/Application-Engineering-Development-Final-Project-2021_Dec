/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.enterprise;
import java.util.List;

import java.util.ArrayList;

import business.roles.Role;
import business.Organization;

/**
 *
 * @author jacksonalexander
 */
public class PersonEnterprise extends Enterprise{
    public PersonEnterprise(String enterpriseName) {
        super(enterpriseName, EnterpriseType.Volunteer);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public ArrayList<Organization> getSupportedType() {
        ArrayList<Organization> listOfOrganization = new ArrayList<>();
        return listOfOrganization;
    }
    
}
