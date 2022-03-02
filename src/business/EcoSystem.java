/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.network.Network;
import business.roles.Role;
import business.roles.SystemAdminRole;
import business.workQueue.WorkQueue;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PRANJAL
 */
public class EcoSystem extends Organization {
    
    public static EcoSystem business;
    public WorkQueue workqueue;
    public ArrayList<Network> listOfNetworks;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }

    public WorkQueue getWorkqueue() {
        return workqueue;
    }

    public void setWorkqueue(WorkQueue workqueue) {
        this.workqueue = workqueue;
    }

    public ArrayList<Network> getListOfNetworks() {
        return listOfNetworks;
    }

    public void setListOfNetworks(ArrayList<Network> listOfNetworks) {
        this.listOfNetworks = listOfNetworks;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        listOfNetworks.add(network);
        return network;
    }

    public void removeNetwork(Network network) {
        listOfNetworks.remove(network);
    }

    public void updateNetwork(Network network, String name) {
        for (Network net : listOfNetworks) {
            if (net.equals(network)) {
                net.setName(name);
            }
        }
    }

    private EcoSystem() {
        super(null);
        listOfNetworks = new ArrayList<Network>();
        workqueue = new WorkQueue();
    }

    public EcoSystem(ArrayList<Network> listOfNetworks) {
        super();
        this.listOfNetworks = listOfNetworks;
    }

    public boolean checkIfUserIsUnique(String userName) {
        if (this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
            return false;
        }
        return true;
    }

    public boolean isDuplicateNetwork(String name) {
        for (Network net : listOfNetworks) {
            if (net.equals(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
}
