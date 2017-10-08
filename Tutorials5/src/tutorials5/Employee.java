/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorials5;

/**
 *
 * @author Muhammad Azizi Saad
 */
public class Employee 
{
    private String firstName;
    private String lastName;
    private double salary;
    
    public Employee()
    {
        firstName = null;
        lastName = null;
        salary = 0.0;
    }
    
    public Employee(String firstName, String lastName, double salary)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;    
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public double bonus()
    {
        double bonus = 0.0;
        
        bonus = salary * 5;
        return bonus;
    }
    
    @Override
    public String toString()
    {
        return("The bonus is RM " +bonus());
    }
}
