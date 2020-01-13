/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */

import java.util.Scanner;

//Main method through which calls will be received and processed
public class FindCallHandler {
    
    public static void main(String[] args)
    {
       
        //Number of employee objects would be equal to total number of calls which are available. The reason is that
        //employee is the main object which will handle the call. If employee would be busy, the call will be deligated 
        //to supervisor and then to manager
        Employee emp1= new Employee();
        Employee emp2= new Employee();
        Employee emp3= new Employee();
        Employee emp4= new Employee();
        Employee emp5= new Employee();
        Employee emp6= new Employee();
        Employee emp7= new Employee();
    
        System.out.println("Total number of employee objects: "+emp1.objectCount);
        
        //Total number of available employees shows how many employees are available exactly. Total count of employee objects represents
        //total number of calls which are present. E.g. if total number of employee objects are 7, it means 7 calls are available and 
        //If user enter number of employees as 3 then first 3 calls will be handled through employees and 4th call will be handled
        //by supervisor and 5th by manager. Last 2 calls will not be handled as no operator is free.
        System.out.println("Enter the number of available employees ");
        Scanner input = new Scanner(System.in);    
        int numEmployees = input.nextInt();

        if (numEmployees>emp1.objectCount)
        {
            System.out.println("Number of employee objects are less than total employees. Please create more employee objects ");
        }

        else
        {
        emp1.setTotalEmployee(numEmployees);
        
        //Singelton instance of supervisor and manager so that no new instance can be created.
        Supervisor supervisor= Supervisor.getInstance();
        Manager manager= Manager.getInstance();
        
        //Setting the next in chain so that supervisor and manager can handle the call if employee is busy
        emp1.setNext(supervisor);
        emp2.setNext(supervisor);
        emp3.setNext(supervisor);
        emp4.setNext(supervisor);
        emp5.setNext(supervisor);
        emp6.setNext(supervisor);
        emp7.setNext(supervisor);

        supervisor.setNext(manager);

        //Method which process the call and call next in line objects if employee is busy or not available
        emp1.processCall(new Call("call1"));

        emp2.processCall(new Call("call2"));

        emp3.processCall(new Call("call3"));

        emp4.processCall(new Call("call4"));

        emp5.processCall(new Call("call5"));

        emp6.processCall(new Call("call6"));

        emp7.processCall(new Call("call7"));
        }


        //System.out.println(numEmployees);
        
    } 
    
}
