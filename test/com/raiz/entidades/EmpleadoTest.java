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
public class EmpleadoTest {
    
    public EmpleadoTest() {
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
    public void testGetCodigoEmpleado() {
        System.out.println("getCodigoEmpleado");
        Empleado instance = new Empleado();
        Integer expResult = null;
        Integer result = instance.getCodigoEmpleado();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetCodigoEmpleado() {
        System.out.println("setCodigoEmpleado");
        Integer codigoEmpleado = null;
        Empleado instance = new Empleado();
        instance.setCodigoEmpleado(codigoEmpleado);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCodigoPais() {
        System.out.println("getCodigoPais");
        Empleado instance = new Empleado();
        int expResult = 0;
        int result = instance.getCodigoPais();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetCodigoPais() {
        System.out.println("setCodigoPais");
        int codigoPais = 0;
        Empleado instance = new Empleado();
        instance.setCodigoPais(codigoPais);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCodigoTipdoc() {
        System.out.println("getCodigoTipdoc");
        Empleado instance = new Empleado();
        int expResult = 0;
        int result = instance.getCodigoTipdoc();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetCodigoTipdoc() {
        System.out.println("setCodigoTipdoc");
        int codigoTipdoc = 0;
        Empleado instance = new Empleado();
        instance.setCodigoTipdoc(codigoTipdoc);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNroDoc() {
        System.out.println("getNroDoc");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getNroDoc();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNroDoc() {
        System.out.println("setNroDoc");
        String nroDoc = "";
        Empleado instance = new Empleado();
        instance.setNroDoc(nroDoc);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetApellidoPaterno() {
        System.out.println("getApellidoPaterno");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getApellidoPaterno();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetApellidoPaterno() {
        System.out.println("setApellidoPaterno");
        String apellidoPaterno = "";
        Empleado instance = new Empleado();
        instance.setApellidoPaterno(apellidoPaterno);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetApellidoMaterno() {
        System.out.println("getApellidoMaterno");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getApellidoMaterno();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetApellidoMaterno() {
        System.out.println("setApellidoMaterno");
        String apellidoMaterno = "";
        Empleado instance = new Empleado();
        instance.setApellidoMaterno(apellidoMaterno);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNombres() {
        System.out.println("getNombres");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getNombres();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNombres() {
        System.out.println("setNombres");
        String nombres = "";
        Empleado instance = new Empleado();
        instance.setNombres(nombres);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetFechaNacimiento() {
        System.out.println("getFechaNacimiento");
        Empleado instance = new Empleado();
        Date expResult = null;
        Date result = instance.getFechaNacimiento();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFechaNacimiento() {
        System.out.println("setFechaNacimiento");
        Date fechaNacimiento = null;
        Empleado instance = new Empleado();
        instance.setFechaNacimiento(fechaNacimiento);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDomicilio() {
        System.out.println("getDomicilio");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getDomicilio();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDomicilio() {
        System.out.println("setDomicilio");
        String domicilio = "";
        Empleado instance = new Empleado();
        instance.setDomicilio(domicilio);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Empleado instance = new Empleado();
        instance.setEmail(email);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCodigoEmpresa() {
        System.out.println("getCodigoEmpresa");
        Empleado instance = new Empleado();
        int expResult = 0;
        int result = instance.getCodigoEmpresa();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetCodigoEmpresa() {
        System.out.println("setCodigoEmpresa");
        int codigoEmpresa = 0;
        Empleado instance = new Empleado();
        instance.setCodigoEmpresa(codigoEmpresa);
        fail("The test case is a prototype.");
    }

    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Empleado instance = new Empleado();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Empleado instance = new Empleado();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
