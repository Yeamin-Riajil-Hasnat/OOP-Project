/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
//Interface for implementation of chain of responsibility design pattern. If the employee is available then it will process the call
//If employee is busy, then next in chain supervisor will handle the call. If supervisor is busy, then next in chain manager
//will handle the call.
public interface Chain 
{
    //Abstract method which will set next in chain 
    public abstract void setNext(Chain nextInChain); 
    //Abstract method which will process the call
    public abstract void processCall(Call call); 
}
