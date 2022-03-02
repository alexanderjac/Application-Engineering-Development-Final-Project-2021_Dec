/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organisation;

import java.util.ArrayList;
import business.Organization;

/**
 *
 * @author PRANJAL
 */
public class OrganisationDirectory {
    
     private ArrayList<Organization> listOfOrganizations;

    public OrganisationDirectory() {
        listOfOrganizations = new ArrayList();
    }

    public ArrayList<Organization> getListOfOrganizations() {
        return listOfOrganizations;
    }

    public void setListOfOrganizations(ArrayList<Organization> listOfOrganizations) {
        this.listOfOrganizations = listOfOrganizations;
    }

    public Organization createAndAddOrganization(Organization.OrganizationType type) {
        Organization organization = null;
        if (type.getValue().equals(Organization.OrganizationType.Doctor.getValue())) {
            organization = new DoctorOrganisation();
            organization.setOrganizationId(listOfOrganizations.size()+1);
            listOfOrganizations.add(organization);
        } else if (type.getValue().equals(Organization.OrganizationType.Lab.getValue())) {
            organization = new LabOrganisation();
            organization.setOrganizationId(listOfOrganizations.size()+1);
            listOfOrganizations.add(organization);
        } else if (type.getValue().equals(Organization.OrganizationType.Nurse.getValue())) {
            organization = new NurseOrganisation();
            organization.setOrganizationId(listOfOrganizations.size()+1);
            listOfOrganizations.add(organization);
        } else if (type.getValue().equals(Organization.OrganizationType.Receptionist.getValue())) {
            organization = new ReceptionistOrganisation();
            organization.setOrganizationId(listOfOrganizations.size()+1);
            listOfOrganizations.add(organization);
        }else if (type.getValue().equals(Organization.OrganizationType.HAS_Healthcare_Representative.getValue())) {
            organization = new HasHealthcareRepresentativeOrganisation();
            organization.setOrganizationId(listOfOrganizations.size()+1);
            listOfOrganizations.add(organization);
        } else if (type.getValue().equals(Organization.OrganizationType.HAS_Shelter_Representative.getValue())) {
            organization = new HasShelterOrganisation();
            organization.setOrganizationId(listOfOrganizations.size()+1);
            listOfOrganizations.add(organization);
        } else if (type.getValue().equals(Organization.OrganizationType.Fundrasier.getValue())) {
            organization = new FundRaiserOrganisation();
            organization.setOrganizationId(listOfOrganizations.size()+1);
            listOfOrganizations.add(organization);
        }  else if (type.getValue().equals(Organization.OrganizationType.NGOOrganization.getValue())) {
            organization = new NGOOrganisation();
            organization.setOrganizationId(listOfOrganizations.size()+1);
            listOfOrganizations.add(organization);
        } else if (type.getValue().equals(Organization.OrganizationType.OldAgeHome.getValue())) {
            organization = new OldAgeHomeOrganisation();
            organization.setOrganizationId(listOfOrganizations.size()+1);
            listOfOrganizations.add(organization);
        }else if (type.getValue().equals(Organization.OrganizationType.ChildCare.getValue())) {
            organization = new ChildCareOrganisation();
            organization.setOrganizationId(listOfOrganizations.size()+1);
            listOfOrganizations.add(organization);
        }else if (type.getValue().equals(Organization.OrganizationType.AdultCare.getValue())) {
            organization = new AdultCareOrganisation();
            organization.setOrganizationId(listOfOrganizations.size()+1);
            listOfOrganizations.add(organization);
        }
        
        return organization;
    }
    
    public void removeOrganization(Organization organization) {
        listOfOrganizations.remove(organization);
    }
    
}
