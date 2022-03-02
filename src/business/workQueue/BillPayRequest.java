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
public class BillPayRequest extends WorkRequest{
    
    private WorkRequest detailsOfPatient;

    public WorkRequest getDetailsOfPatient() {
        return detailsOfPatient;
    }

    public void setDetailsOfPatient(WorkRequest detailsOfPatient) {
        this.detailsOfPatient = detailsOfPatient;
    }

    


}
