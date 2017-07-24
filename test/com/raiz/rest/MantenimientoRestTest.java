/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raiz.rest;

import com.raiz.entidades.Empleado;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class MantenimientoRestTest {
    
    public MantenimientoRestTest() {
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

    //@Test
    public void testInsertEmpleado() {
        System.out.println("insertEmpleado");
        Empleado empleado = null;
        MantenimientoRest instance = new MantenimientoRest();
        String expResult = "";
        Integer result = instance.insertEmpleado(empleado);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetEmpleados() {
        System.out.println("getEmpleados");
        MantenimientoRest instance = new MantenimientoRest();
        List<Empleado> expResult = null;
        List<Empleado> result = instance.getEmpleados();
        //assertEquals(expResult, result);
    }

    //@Test
    public void testFindEmpleado() {
        System.out.println("findEmpleado");
        Integer id = null;
        MantenimientoRest instance = new MantenimientoRest();
        Empleado expResult = null;
        Empleado result = instance.findEmpleado(id);
        assertEquals(expResult, result);
    }

    //@Test
    public void testEditEmpleado() {
        System.out.println("editEmpleado");
        Integer id = null;
        Empleado empleado = null;
        MantenimientoRest instance = new MantenimientoRest();
        String expResult = "";
        String result = instance.editEmpleado(id, empleado);
        assertEquals(expResult, result);
    }

    //@Test
    public void testDeleteEmpleado() {
        System.out.println("deleteEmpleado");
        Integer id = null;
        MantenimientoRest instance = new MantenimientoRest();
        String expResult = "";
        String result = instance.deleteEmpleado(id);
        assertEquals(expResult, result);
    }
    
}
