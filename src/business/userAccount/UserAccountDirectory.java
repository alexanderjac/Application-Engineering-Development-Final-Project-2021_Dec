/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.userAccount;

import business.employee.Employee;
import business.roles.Role;
import java.util.ArrayList;

/**
 *
 * @author PRANJAL
 */
public class UserAccountDirectory {
    
    ArrayList<UserAccount> listOfUserAccounts;

    public UserAccountDirectory() {
        listOfUserAccounts = new ArrayList<>();
    }

    public ArrayList<UserAccount> getListOfUserAccounts() {
        return listOfUserAccounts;
    }

    public void setListOfUserAccounts(ArrayList<UserAccount> listOfUserAccounts) {
        this.listOfUserAccounts = listOfUserAccounts;
    }

    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount ua : listOfUserAccounts) {
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }

    public boolean checkIfUsernameIsUnique(String userName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public UserAccount createAndAddUserAccount(String username, String password, Employee emp, Role role) {

        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmp(emp);
        userAccount.setRole(role);
        listOfUserAccounts.add(userAccount);
        return userAccount;
    }

    public UserAccount removeUserAccount(UserAccount useraccount) {
        listOfUserAccounts.remove(useraccount);
        return useraccount;
    }
    
}
