/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.fundraiser;
import java.util.ArrayList;
import business.userAccount.UserAccount;


/**
 *
 * @author jacksonalexander
 */
public class FundRaiser {
    
    private String phoneNumber;
    private String emailID; 
    private String companyName;
    private UserAccount userAcc;
    private String address;
    
   
    private ArrayList<Double> listOfDonations = new ArrayList<>();
    
       public FundRaiser(String name, UserAccount userAcc, String address, String phoneNumber, String emailID) {
        this.companyName = name;
        this.userAcc = userAcc;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailID = emailID;
    }

       public FundRaiser() {
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public UserAccount getUserAcc() {
        return userAcc;
    }

    public void setUserAcc(UserAccount userAcc) {
        this.userAcc = userAcc;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Double> getListOfDonations() {
        return listOfDonations;
    }

    public void setListOfDonations(ArrayList<Double> listOfDonations) {
        this.listOfDonations = listOfDonations;
    }
    
    @Override
    public String toString(){
        if(!companyName.isEmpty()){
            return companyName;
        }
        return userAcc.getEmp().getEmployeeName();
    }
    
    
 
    

}
