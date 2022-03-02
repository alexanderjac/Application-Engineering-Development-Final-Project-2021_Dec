/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

import java.util.ArrayList;

/**
 *
 * @author PRANJAL
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> listOfWorkRequests;

    public WorkQueue() {
        listOfWorkRequests = new ArrayList();
    }

    public ArrayList<WorkRequest> getListOfWorkRequests() {
        return listOfWorkRequests;
    }

    public void setListOfWorkRequests(ArrayList<WorkRequest> listOfWorkRequests) {
        this.listOfWorkRequests = listOfWorkRequests;
    }

    
    public void removeWorkRequest(WorkRequest workRequest){
        listOfWorkRequests.remove(workRequest);
    }
    
}
