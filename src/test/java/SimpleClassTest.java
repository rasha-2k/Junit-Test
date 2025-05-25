/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rasha
 */
public class SimpleClassTest {
    
    public SimpleClassTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addEm method, of class SimpleClass.
     */
    @Test
    public void testAddEm() {
        System.out.println("addEm");
        int a = 5;
        int b = 20;
        SimpleClass instance = new SimpleClass();
        int expResult = 25;
        int result = instance.addEm(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of subEm method, of class SimpleClass.
     */
    @Test
    public void testSubEm() {
        System.out.println("subEm");
        int a = 70;
        int b = 50;
        SimpleClass instance = new SimpleClass();
        int expResult = 20;
        int result = instance.subEm(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of divEm method, of class SimpleClass.
     */
    @Test
    public void testDivEm() {
        System.out.println("divEm");
        int a = 5;
        int b = 2;
        SimpleClass instance = new SimpleClass();
        float expResult = 2.0F;
        float result = instance.divEm(a, b);
        assertEquals(expResult, result, 0);
    }
    
}
