/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package modelBean;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ACER
 */
public class ModelBeanTest {
    
    public ModelBeanTest() {
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
     * Test of horoscopo method, of class ModelBean.
     */
    @Test
    public void testHoroscopo() {
        System.out.println("horoscopo");
        ModelBean instance = new ModelBean();
        instance.horoscopo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class ModelBean.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        ModelBean instance = new ModelBean();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class ModelBean.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        ModelBean instance = new ModelBean();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEdad method, of class ModelBean.
     */
    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        ModelBean instance = new ModelBean();
        int expResult = 0;
        int result = instance.getEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEdad method, of class ModelBean.
     */
    @Test
    public void testSetEdad() {
        System.out.println("setEdad");
        int edad = 0;
        ModelBean instance = new ModelBean();
        instance.setEdad(edad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSignoZodiacal method, of class ModelBean.
     */
    @Test
    public void testGetSignoZodiacal() {
        System.out.println("getSignoZodiacal");
        ModelBean instance = new ModelBean();
        String expResult = "";
        String result = instance.getSignoZodiacal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSignoZodiacal method, of class ModelBean.
     */
    @Test
    public void testSetSignoZodiacal() {
        System.out.println("setSignoZodiacal");
        String signoZodiacal = "";
        ModelBean instance = new ModelBean();
        instance.setSignoZodiacal(signoZodiacal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
