/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
//Manager class which implements chain interface
public class Manager implements Chain{
    private Chain nextInChain; 
    private int managerCount=1;
    
    private static Manager single_manager = null; 
    
    //Private constructor, so that objects can't be created through constructor
    private Manager()
    {
    }
    
    //Sigelton method through which no more than 1 instance can be fetched. Implementation of singelton pattern
     public static Manager getInstance() 
    { 
        if (single_manager == null) 
            single_manager = new Manager(); 
  
        return single_manager; 
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
        if (managerCount<=1) 
        { 
            System.out.println("Manager Handling the : "+call.getCall()); 
            managerCount++;
        } 
        else
        { 
            System.out.println("All Operators are busy "); 
        } 
    } 
}
