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
public class SponsorApprovalStatus extends WorkRequest{
    private String resultOfTest;
    
    public void setResultOfTest(String resultOfTest) {
        this.resultOfTest = resultOfTest;
    }
    
    public String getResultOfTest() {
        return resultOfTest;
    }  
    
}
