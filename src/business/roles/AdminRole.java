/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.roles;

import business.EcoSystem;
import business.Organization;
import static business.Organization.OrganizationType.NGOOrganization;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organisation.FundRaiserOrganisation;
import business.organisation.NGOOrganisation;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.adminFundRole.FundsAdminWorkAreaJPanel;
import userinterface.adminHospitalRole.HospitalAdminWorkAreaJPanel;
import userinterface.adminNGORole.NGOAdminWorkAreaJPanel;
import userinterface.adminVolunteerRole.VolunteerAdminWorkAreaJPanel;

/**
 *
 * @author PRANJAL
 */
public class AdminRole extends Role {
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Volunteer.getValue())){
                return new VolunteerAdminWorkAreaJPanel(userProcessContainer, enterprise,account,network,business);
        }else if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.NGO.getValue())){
                return new NGOAdminWorkAreaJPanel(userProcessContainer, account, (NGOOrganisation)organization, enterprise,network, business);
        }else if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.FundRaiser.getValue())){
                return new FundsAdminWorkAreaJPanel(userProcessContainer, account, (FundRaiserOrganisation)organization, enterprise,network, business);
        }else{
         return new HospitalAdminWorkAreaJPanel(userProcessContainer, enterprise,account,network,business);
        }     }
    
}
