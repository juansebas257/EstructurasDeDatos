/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasC;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CALIDAD
 */
public class NodoLTest {
    
    public NodoLTest() {
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
     * Test of getDato method, of class NodoL.
     */
    @Test
    public void testGetDato() {
        System.out.println("getDato");
        NodoL instance = null;
        int expResult = 0;
        int result = instance.getDato();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDato method, of class NodoL.
     */
    @Test
    public void testSetDato() {
        System.out.println("setDato");
        int dato = 0;
        NodoL instance = null;
        instance.setDato(dato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSiguiente method, of class NodoL.
     */
    @Test
    public void testGetSiguiente() {
        System.out.println("getSiguiente");
        NodoL instance = null;
        instance.getSiguiente();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSiguiente method, of class NodoL.
     */
    @Test
    public void testSetSiguiente() {
        System.out.println("setSiguiente");
        Nodo siguiente = null;
        NodoL instance = null;
        instance.setSiguiente(siguiente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
