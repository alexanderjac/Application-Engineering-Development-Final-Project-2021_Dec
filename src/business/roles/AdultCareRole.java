/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.roles;

import business.Organization;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organisation.OldAgeHomeOrganisation;
import userinterface.oldAgeHomeRole.OldAgeHomeJPanel;
import business.EcoSystem;

/**
 *
 * @author PRANJAL
 */
public class AdultCareRole extends Role {
    
         @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
       return new OldAgeHomeJPanel(userProcessContainer, account, (OldAgeHomeOrganisation) organization, enterprise,network, business);
    }
    
}
