/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.roles;

import business.EcoSystem;
import static business.EcoSystem.business;
import business.Organization;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organisation.DoctorOrganisation;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.doctorRole.DoctorWorkAreaJPanel;

/**
 *
 * @author PRANJAL
 */
public class DoctorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem ecosystem) {
        return new DoctorWorkAreaJPanel(userProcessContainer, account, (DoctorOrganisation) organization, enterprise, business);
    }
    
}
