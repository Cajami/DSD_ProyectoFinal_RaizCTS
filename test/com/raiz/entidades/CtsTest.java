/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raiz.entidades;

import java.util.Date;
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
public class CtsTest {
    
    public CtsTest() {
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
    public void testGetCodigoCts() {
        System.out.println("getCodigoCts");
        Cts instance = new Cts();
        Integer expResult = null;
        Integer result = instance.getCodigoCts();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetCodigoCts() {
        System.out.println("setCodigoCts");
        Integer codigoCts = null;
        Cts instance = new Cts();
        instance.setCodigoCts(codigoCts);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCodigoUsuario() {
        System.out.println("getCodigoUsuario");
        Cts instance = new Cts();
        int expResult = 0;
        int result = instance.getCodigoUsuario();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetCodigoUsuario() {
        System.out.println("setCodigoUsuario");
        int codigoUsuario = 0;
        Cts instance = new Cts();
        instance.setCodigoUsuario(codigoUsuario);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetFechaIngreso() {
        System.out.println("getFechaIngreso");
        Cts instance = new Cts();
        Date expResult = null;
        Date result = instance.getFechaIngreso();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFechaIngreso() {
        System.out.println("setFechaIngreso");
        Date fechaIngreso = null;
        Cts instance = new Cts();
        instance.setFechaIngreso(fechaIngreso);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetFechaModifica() {
        System.out.println("getFechaModifica");
        Cts instance = new Cts();
        Date expResult = null;
        Date result = instance.getFechaModifica();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFechaModifica() {
        System.out.println("setFechaModifica");
        Date fechaModifica = null;
        Cts instance = new Cts();
        instance.setFechaModifica(fechaModifica);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetFechaApertura() {
        System.out.println("getFechaApertura");
        Cts instance = new Cts();
        Date expResult = null;
        Date result = instance.getFechaApertura();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFechaApertura() {
        System.out.println("setFechaApertura");
        Date fechaApertura = null;
        Cts instance = new Cts();
        instance.setFechaApertura(fechaApertura);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTasa() {
        System.out.println("getTasa");
        Cts instance = new Cts();
        double expResult = 0.0;
        double result = instance.getTasa();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTasa() {
        System.out.println("setTasa");
        double tasa = 0.0;
        Cts instance = new Cts();
        instance.setTasa(tasa);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Cts instance = new Cts();
        Character expResult = null;
        Character result = instance.getEstado();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        Character estado = null;
        Cts instance = new Cts();
        instance.setEstado(estado);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTraslado() {
        System.out.println("getTraslado");
        Cts instance = new Cts();
        Character expResult = null;
        Character result = instance.getTraslado();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTraslado() {
        System.out.println("setTraslado");
        Character traslado = null;
        Cts instance = new Cts();
        instance.setTraslado(traslado);
        fail("The test case is a prototype.");
    }

    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Cts instance = new Cts();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Cts instance = new Cts();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Cts instance = new Cts();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
