/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raiz.entidades;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Onice
 */
public class TipoAutorizacionTest {
    
    public TipoAutorizacionTest() {
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

    @Test
    public void testGetCodigoAutorizacion() {
        System.out.println("getCodigoAutorizacion");
        TipoAutorizacion instance = new TipoAutorizacion();
        Integer expResult = null;
        Integer result = instance.getCodigoAutorizacion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetCodigoAutorizacion() {
        System.out.println("setCodigoAutorizacion");
        Integer codigoAutorizacion = null;
        TipoAutorizacion instance = new TipoAutorizacion();
        instance.setCodigoAutorizacion(codigoAutorizacion);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        TipoAutorizacion instance = new TipoAutorizacion();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        TipoAutorizacion instance = new TipoAutorizacion();
        instance.setDescripcion(descripcion);
        fail("The test case is a prototype.");
    }

    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        TipoAutorizacion instance = new TipoAutorizacion();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        TipoAutorizacion instance = new TipoAutorizacion();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        TipoAutorizacion instance = new TipoAutorizacion();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
