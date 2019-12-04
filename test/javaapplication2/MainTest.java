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
public class MainTest {
    
    public MainTest() {
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
     * Test of main method, of class Main.
     */
    @Test
    public void testCheckYesGood() {
        System.out.println("main");
        String pass = "yes";
        boolean expResult = true;
        boolean result = Main.checkYes(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCheckYesBad() {
        System.out.println("main");
        String pass = "m";
        boolean expResult = false;
        boolean result = Main.checkYes(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCheckYesBoundary() {
        System.out.println("main");
        String pass = "";
        boolean expResult = false;
        boolean result = Main.checkYes(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");   
    }
    
    @Test
    public void testCheckNoGood() {
        System.out.println("main");
        String pass = "no";
        boolean expResult = true;
        boolean result = Main.checkNo(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCheckNoBad() {
        System.out.println("main");
        String pass = "m";
        boolean expResult = false;
        boolean result = Main.checkNo(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCheckNoBoundary() {
        System.out.println("main");
        String pass = "";
        boolean expResult = false;
        boolean result = Main.checkNo(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCheckHitGood() {
        System.out.println("main");
        String pass = "hit";
        boolean expResult = true;
        boolean result = Main.checkHit(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCheckHitBad() {
        System.out.println("main");
        String pass = "mo";
        boolean expResult = false;
        boolean result = Main.checkHit(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCheckHitBoundary() {
        System.out.println("main");
        String pass = "";
        boolean expResult = false;
        boolean result = Main.checkHit(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        @Test
    public void testCheckStandGood() {
        System.out.println("main");
        String pass = "stand";
        boolean expResult = true;
        boolean result = Main.checkStand(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCheckStandBad() {
        System.out.println("main");
        String pass = "mo";
        boolean expResult = false;
        boolean result = Main.checkStand(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCheckStandBoundary() {
        System.out.println("main");
        String pass = "";
        boolean expResult = false;
        boolean result = Main.checkStand(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
