/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

import business.enterprise.Enterprise;
import business.network.Network;
import business.userAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author PRANJAL
 */
public class WorkRequest {
    
    private String objectName;
    
    private UserAccount sender;
    private UserAccount receiver;
    private String message;
    private WorkRequest request;
    private String typeOfRequest;
    private String status;
    
    private String nurseStatus;
    private String nurseMessage;
    private String labMessage;
    private Date dateOfRequest;
    private Date dateOfResolve;

    // Fund Raiser
    private String name;
    private String username;
    private String password;
    private String companyName;
    private String role;
    private String address;
    private String mobile;
    private String email;
    private String donarName;
    
    // Patient Registration
    private String patientFirstName;
    private String patientLastLame;
    private int patientId;
    private int patientHeight;
    private int patientWeight;
    private String patientGender;
    private String patientProfileImage;
    private String patientBloodGroup;
    private String patientBloodPressure;
    private float patientGlucoseLevel;
    private float patientBodyTemperature;
    private String patientSymptoms;
    private String patientDisease;
    private String patientDiagnosis;
    private String patientPriority;
    private int patientFee;
    private int hospitalFee = 0;
    
    // Shelter Request
    private String shelterRequestName;
    private String assignedFor;
    private String assignedShelter;
    private int ageOfPerson;
    
    // interNetwork;
    private Enterprise requestedEnterprise;
    private Network requestedNetwork;
    private int requestedAmount;
    
    @Override
    public String toString(){
        return objectName;
    }

    public Date getDateOfRequest() {
        return dateOfRequest;
    }

    public void setDateOfRequest(Date dateOfRequest) {
        this.dateOfRequest = dateOfRequest;
    }

    public Date getDateOfResolve() {
        return dateOfResolve;
    }

    public void setDateOfResolve(Date dateOfResolve) {
        this.dateOfResolve = dateOfResolve;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public String getPatientLastLame() {
        return patientLastLame;
    }

    public void setPatientLastLame(String patientLastLame) {
        this.patientLastLame = patientLastLame;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getPatientHeight() {
        return patientHeight;
    }

    public void setPatientHeight(int patientHeight) {
        this.patientHeight = patientHeight;
    }

    public int getPatientWeight() {
        return patientWeight;
    }

    public void setPatientWeight(int patientWeight) {
        this.patientWeight = patientWeight;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public String getPatientProfileImage() {
        return patientProfileImage;
    }

    public void setPatientProfileImage(String patientProfileImage) {
        this.patientProfileImage = patientProfileImage;
    }

    public String getPatientBloodGroup() {
        return patientBloodGroup;
    }

    public void setPatientBloodGroup(String patientBloodGroup) {
        this.patientBloodGroup = patientBloodGroup;
    }

    public String getPatientBloodPressure() {
        return patientBloodPressure;
    }

    public void setPatientBloodPressure(String patientBloodPressure) {
        this.patientBloodPressure = patientBloodPressure;
    }

    public float getPatientGlucoseLevel() {
        return patientGlucoseLevel;
    }

    public void setPatientGlucoseLevel(float patientGlucoseLevel) {
        this.patientGlucoseLevel = patientGlucoseLevel;
    }

    public float getPatientBodyTemperature() {
        return patientBodyTemperature;
    }

    public void setPatientBodyTemperature(float patientBodyTemperature) {
        this.patientBodyTemperature = patientBodyTemperature;
    }

    public String getPatientSymptoms() {
        return patientSymptoms;
    }

    public void setPatientSymptoms(String patientSymptoms) {
        this.patientSymptoms = patientSymptoms;
    }

    public String getPatientDisease() {
        return patientDisease;
    }

    public void setPatientDisease(String patientDisease) {
        this.patientDisease = patientDisease;
    }

    public String getPatientDiagnosis() {
        return patientDiagnosis;
    }

    public void setPatientDiagnosis(String patientDiagnosis) {
        this.patientDiagnosis = patientDiagnosis;
    }

    public String getPatientPriority() {
        return patientPriority;
    }

    public void setPatientPriority(String patientPriority) {
        this.patientPriority = patientPriority;
    }

    public int getPatientFee() {
        return patientFee;
    }

    public void setPatientFee(int patientFee) {
        this.patientFee = patientFee;
    }

    public int getHospitalFee() {
        return hospitalFee;
    }

    public void setHospitalFee(int hospitalFee) {
        this.hospitalFee = hospitalFee;
    }

    public String getAssignedFor() {
        return assignedFor;
    }

    public void setAssignedFor(String assignedFor) {
        this.assignedFor = assignedFor;
    }

    public int getAgeOfPerson() {
        return ageOfPerson;
    }

    public void setAgeOfPerson(int ageOfPerson) {
        this.ageOfPerson = ageOfPerson;
    }
    
    public int getRequestedAmount() {
        return requestedAmount;
    }

    public void setRequestedAmount(int requestedAmount) {
        this.requestedAmount = requestedAmount;
    }

    
    public Network getRequestedNetwork() {
        return requestedNetwork;
    }

    public void setRequestedNetwork(Network requestedNetwork) {
        this.requestedNetwork = requestedNetwork;
    }
    
    public Enterprise getRequestedEnterprise() {
        return requestedEnterprise;
    }

    public void setRequestedEnterprise(Enterprise requestedEnterprise) {
        this.requestedEnterprise = requestedEnterprise;
    }
    
    public String getObjectName() {
        return objectName;
    }
    
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getDonarName() {
        return donarName;
    }

    public void setDonarName(String donarName) {
        this.donarName = donarName;
    }

    public String getShelterRequestName() {
        return shelterRequestName;
    }

    public void setShelterRequestName(String shelterRequestName) {
        this.shelterRequestName = shelterRequestName;
    }

    public String getAssignedShelter() {
        return assignedShelter;
    }

    public void setAssignedShelter(String assignedShelter) {
        this.assignedShelter = assignedShelter;
    }

    public WorkRequest getRequest() {
        return request;
    }

    public void setRequest(WorkRequest request) {
        this.request = request;
    }
    
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTypeOfRequest() {
        return typeOfRequest;
    }

    public void setTypeOfRequest(String typeOfRequest) {
        this.typeOfRequest = typeOfRequest;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNurseStatus() {
        return nurseStatus;
    }

    public void setNurseStatus(String nurseStatus) {
        this.nurseStatus = nurseStatus;
    }

    public String getNurseMessage() {
        return nurseMessage;
    }

    public void setNurseMessage(String nurseMessage) {
        this.nurseMessage = nurseMessage;
    }

    public String getLabMessage() {
        return labMessage;
    }

    public void setLabMessage(String labMessage) {
        this.labMessage = labMessage;
    }
    
}
