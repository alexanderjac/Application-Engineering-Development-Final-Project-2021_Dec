/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package business.enterprise;
import java.util.List;

import java.util.ArrayList;

import business.organisation.LabOrganisation;
import business.roles.Role;

import business.organisation.NurseOrganisation;
import business.Organization;

import business.organisation.DoctorOrganisation;
/**
 *
 * @author jacksonalexander
 */
public class HospitalEnterprise extends Enterprise{
    public HospitalEnterprise(String hospitalName) {
        super(hospitalName, EnterpriseType.Hospital);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    @Override
    public ArrayList<Organization> getSupportedType() {
        ArrayList<Organization> listOfOrganization = new ArrayList<>();
        listOfOrganization.add(new DoctorOrganisation());
        listOfOrganization.add(new LabOrganisation());
        listOfOrganization.add(new NurseOrganisation());
        return listOfOrganization;
    }
}
