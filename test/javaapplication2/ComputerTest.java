/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fakih
 */
public class ComputerTest {
    
    public ComputerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of pointsCalculation method, of class Computer.
     */
    @Test
    public void testPointsCalculation() {
        System.out.println("pointsCalculation");
        Computer instance = new Computer();
        instance.pointsCalculation();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDealerPoints method, of class Computer.
     */
    @Test
    public void testGetDealerPoints() {
        System.out.println("getDealerPoints");
        Computer instance = new Computer();
        int expResult = 0;
        int result = instance.getDealerPoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDealerPoints method, of class Computer.
     */
    @Test
    public void testSetDealerPoints() {
        System.out.println("setDealerPoints");
        int dealerPoints = 0;
        Computer instance = new Computer();
        instance.setDealerPoints(dealerPoints);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
