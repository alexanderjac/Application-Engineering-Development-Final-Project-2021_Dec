/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.roles;

import userinterface.corporateRole.CorporateFundRaiserJPanel;
import business.Organization;
import business.enterprise.Enterprise;
import business.enterprise.FundEnterprise;
import javax.swing.JPanel;
import business.network.Network;
import business.organisation.FundRaiserOrganisation;
import business.userAccount.UserAccount;
import business.EcoSystem;

/**
 *
 * @author PRANJAL
 */
public class CorporateRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new CorporateFundRaiserJPanel(userProcessContainer, account, (FundRaiserOrganisation)organization, (FundEnterprise)enterprise,network, business);
    }
    
}
