/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.roles;

import business.EcoSystem;
import business.Organization;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organisation.FundRaiserOrganisation;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.adminFundRole.FundsAdminWorkAreaJPanel;

/**
 *
 * @author PRANJAL
 */
public class FundAdminRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new FundsAdminWorkAreaJPanel(userProcessContainer, account, (FundRaiserOrganisation)organization, enterprise,network, business);
    }
    
}
