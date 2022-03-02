/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.roles;

import business.organisation.HasHealthcareRepresentativeOrganisation;
import userinterface.HASEmployeeRole.HasEmployeeMainWorkAreaJPanel;
import business.Organization;
import business.userAccount.UserAccount;
import business.enterprise.Enterprise;
import business.network.Network;
import business.EcoSystem;
import javax.swing.JPanel;

/**
 *
 * @author PRANJAL
 */
public class HasHealthcareRepresentativeRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new HasEmployeeMainWorkAreaJPanel(userProcessContainer, account, (HasHealthcareRepresentativeOrganisation) organization, enterprise, business);
    }
    
}
