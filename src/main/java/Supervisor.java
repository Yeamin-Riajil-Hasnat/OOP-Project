/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
//Supervisor class which implements chain interface
public class Supervisor implements Chain
{
    private Chain nextInChain; 
    private int supervisorCount=1;
    
    private static Supervisor single_supervisor = null; 
    
    //Private constructor, so that objects can't be created through constructor
    private Supervisor()
    {
    }
    
    //Sigelton method through which no more than 1 instance can be fetched. Implementation of singelton pattern
     public static Supervisor getInstance() 
    { 
        if (single_supervisor == null) 
            single_supervisor = new Supervisor(); 
  
        return single_supervisor; 
    } 
    
     //Overriden method to set next in chain object
    public void setNext(Chain c) 
    { 
        nextInChain = c; 
    } 
    
    public Chain getNext()
    {
    return nextInChain;
    }
    
    //Overriden method if supervisor is availabe then it will process the call otherwise manager will process the call
    public void processCall(Call call) 
    { 
        if (supervisorCount<=1) 
        { 
            System.out.println("Supervisor Handling the : "+call.getCall()); 
            supervisorCount++;
        } 
        else
        { 
            nextInChain.processCall(call); 
        } 
    } 
}
