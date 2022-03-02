/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import java.util.List;
import business.roles.Role;
import java.util.ArrayList;

import business.organisation.NGOOrganisation;



import business.Organization;
/**
 *
 * @author jacksonalexander
 */
public class NGOEnterprise extends Enterprise{
    public NGOEnterprise(String ngoName) {
        super(ngoName, EnterpriseType.NGO);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    @Override
    public ArrayList<Organization> getSupportedType() {
        ArrayList<Organization> listOfOrganization = new ArrayList<>();
        listOfOrganization.add(new NGOOrganisation());
        return listOfOrganization;
    }
    
}
