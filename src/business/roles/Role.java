/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.roles;

import static business.EcoSystem.business;
import business.Organization;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import business.enterprise.Enterprise;
import business.network.Network;
import business.EcoSystem;

/**
 *
 * @author PRANJAL
 */
public abstract class Role {
 
        public enum RoleType {
        Pharmacy("Pharmacy"),
        Nurse("Nurse"),
        Receptionist("Redirector"),
        Admin("Admin"),
        Doctor("Doctor"),
        Corporate("Corporate"),
        General("General"),
        LabAssistant("Lab Assistant"),
        Volunteer("Volunteer");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            Network network,
            EcoSystem ecosystem);
    
    public EcoSystem getEcoSystem() {
        return business;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
}
