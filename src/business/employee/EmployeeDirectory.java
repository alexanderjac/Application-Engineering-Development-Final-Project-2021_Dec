/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.employee;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PRANJAL
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> listOfEmployees;
    
    public EmployeeDirectory() {
        listOfEmployees = new ArrayList<>();
    }

    public ArrayList<Employee> getListOfEmployees() {
        return listOfEmployees;
    }

    public void setListOfEmployees(ArrayList<Employee> listOfEmployees) {
        this.listOfEmployees = listOfEmployees;
    }
    
    public Employee createAndAddEmployee(String name) {
        Employee emp = new Employee();
        emp.setEmployeeName(name);
        emp.setId(listOfEmployees.size()+1);
        listOfEmployees.add(emp);
        return emp;
    }
    
    public void removeEmployee(Employee emp) {
        listOfEmployees.remove(emp);
    }

    public Employee getUniqueEmployee(String name) {
        for (Employee emp : listOfEmployees) {
            if (emp.getEmployeeName().equals(name)) {
                return emp;
            }
        }
        return null;
    }
    
}
