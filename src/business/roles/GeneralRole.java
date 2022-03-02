/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.roles;

import business.userAccount.UserAccount;
import business.Organization;
import business.enterprise.Enterprise;
import javax.swing.JPanel;
import userinterface.generalRole.GeneralFundRaiserJPanel;
import business.network.Network;
import business.EcoSystem;

/**
 *
 * @author PRANJAL
 */
public class GeneralRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new GeneralFundRaiserJPanel(userProcessContainer);
    }
    
    
}
