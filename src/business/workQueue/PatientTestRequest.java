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
public class PatientTestRequest  extends WorkRequest {

    private String resultOfPatient;

    public void setResultOfPatient(String resultOfPatient) {
        this.resultOfPatient = resultOfPatient;
    }
    
    public String getResultOfPatient() {
        return resultOfPatient;
    }
   
    
}
