/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class FindCallHandlerUnitTest {
    
    public FindCallHandlerUnitTest() {
    }
    public Employee getEmployees()
    {
    Employee emp1= new Employee();
    emp1.setTotalEmployee(0);
    return emp1;
    }
    public int setTotalNumberofEmployees()
    {
    Employee emp1=getEmployees();
    return emp1.getTotalEmployee();
    }
    public Manager isValidManager()
    {
     Manager manager= Manager.getInstance();
     return manager;
    }
    public Supervisor isValidSupervisor()
    {
     Supervisor supervisor= Supervisor.getInstance();
     return supervisor;
    }
    public Call GetCall()
    {
     Call call= new Call("Call1");
     return call;
    }
    /*Tests starts here*/
    @Test
    public void TotalNumberofEmployee() 
        {
        setTotalNumberofEmployees();
        Assert.assertTrue( setTotalNumberofEmployees() == 0);
        }
    @Test
    public void isValidsupervisor() 
        {
        Assert.assertNotNull(isValidSupervisor());
        }
    @Test
    public void isValidmanager() 
        {
        Assert.assertNotNull(isValidManager());
        }
   @Test
    public void getCallTest()
    {
     Assert.assertEquals(GetCall().getCall(),"Call1");
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
