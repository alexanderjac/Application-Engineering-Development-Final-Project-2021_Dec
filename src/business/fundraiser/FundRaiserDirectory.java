/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.fundraiser;

import java.util.ArrayList;

/**
 *
 * @author jacksonalexander
 */
public class FundRaiserDirectory {
    
        private ArrayList<FundRaiser> listOfFundRaiser = new ArrayList<>();

    public FundRaiserDirectory() {
    }

    public ArrayList<FundRaiser> getListOfFundRaiser() {
        return listOfFundRaiser;
    }

    public void setListOfFundRaiser(ArrayList<FundRaiser> listOfFundRaiser) {
        this.listOfFundRaiser = listOfFundRaiser;
    }

     public FundRaiser create(){
        FundRaiser fundRaiser = new FundRaiser();
        listOfFundRaiser.add(fundRaiser);
        return fundRaiser;
    }
    
    public void remove(FundRaiser encounter) {
        listOfFundRaiser.remove(encounter);
    }        
        

    
}
