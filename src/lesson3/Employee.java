/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3;

/**
 *
 * @author Temporary
 */
public class Employee {
    private String firstName, surname, occupation;
    private double salary;
    
    public Employee() {
        //empty constructor, I do nothing.
    }
    
    public Employee(String firstName, String surname, double hourlySalary, String occupation) {
        this.firstName = firstName;
        this.surname = surname; 
        this.salary = hourlyToMonthly(hourlySalary);
        this.occupation = occupation;
    }
    
    private double hourlyToMonthly(double hourlySalary) {
        return hourlySalary * 8 * 22;
    }
    
    public String returnAllVariables() {
        return this.firstName + " " + this.surname + "'s monthly salary is: R" + this.salary + " for being a " + this.occupation + 
                "\n R" + this.calcTaxes(salary)  + " is taxes, takehome is: R " + this.calcTakeHome() ;
    }
    
    private double calcTaxes(double salary) {
        if(salary > 40000.00) {
            return this.salary * 0.4;   
        }else if(salary > 30000.00) {
            return this.salary * 0.3;
        }else if(salary > 20000.00) {
            return this.salary * 0.2;
        }else if(salary > 10000.00) {
            return this.salary * 0.1;
        } return 0;
    }
    
    private double calcTakeHome() {
         return this.salary - this.calcTaxes(this.salary);  
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
