/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
//Employee class which implements chain interface 
public class Employee implements Chain {
    
    private Chain nextInChain; 
    static int employeeCount=1;
    static int totalEmployee;
    static int objectCount;
    
    //Constructor
    public Employee()
    {
        objectCount++;
    }
    
    //Overriden method to set next in chain object
    public void setNext(Chain c) 
    { 
        nextInChain = c; 
    } 
    
    //Overriden method if employee is availabe then it will process the call otherwise supervisor will process the call
    public void processCall(Call call) 
    { 
        if (employeeCount<=totalEmployee) 
        { 
            System.out.println("Employee Handling the : "+call.getCall()); 
            employeeCount++;
        } 
        else
        { 
            nextInChain.processCall(call); 
        } 
    } 
    
    static void setTotalEmployee(int number)
    {
        totalEmployee=number;
    }
    
    public int getTotalEmployee()
    {
        return this.totalEmployee;
    }
    
}
