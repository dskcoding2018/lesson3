/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3;

import java.util.ArrayList;

/**
 *
 * @author Temporary
 */
public class Lesson3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        
        Employee myFirstEmployee = new Employee("Jason", "Kolbert", 200.00, "Teacher");
        Employee mySecondEmployee = new Employee("Peter", "Green", 160.00, "Teacher");
        Employee myThirdEmployee = new Employee("Robert", "Orange", 160.00, "Janitor");
        
        employees.add(myFirstEmployee);
        employees.add(mySecondEmployee);
        employees.add(myThirdEmployee);
        employees.add(new Employee("MyLastGuy", "His Surname", 30.00, "Tester"));
        
        for(Employee employee: employees) {
            System.out.println(employee.returnAllVariables());
        }
        
        //ask the user an option
        //add employee, edit employee, or remove employee.
        //4th option calculate end of month payroll for everyone.
        
        //while loop for menu.
            //print out 4 options
            
           
    }
    
    
}
