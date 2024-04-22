/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package poe;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class POETest {
    
    public POETest() {
    }
    
    @Test
    public static void testValidCredentiels() {
    assertTrue(Login.isValid("user","Pass"));
    }
    
    @Test
    public static void testInvalidUsername() {
        assertFalse(Login.isValid("user","Pass"));
    }
    
    @Test
    public void testInvalidPassword() {
        assertTrue(Login.isValid("user","Pass"));
    }
    
    @Test
    public void testInvalidCredentials() {
        assertTrue(Login.isValid("user","Pass8"));
    }

    /**
     * Test of performoption method, of class POE.
     */
    @Test
    public void testPerformoption() {
        System.out.println("performoption");
        POE.performoption();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class POE.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        POE.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
