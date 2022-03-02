/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

/**
 *
 * @author PRANJAL
 */
public class ShelterRequest extends WorkRequest {
    private String shelterAssigned;

    public void setShelterAssigned(String shelterAssigned) {
        this.shelterAssigned = shelterAssigned;
    }
    
    public String getShelterAssigned() {
        return shelterAssigned;
    }
    
}
