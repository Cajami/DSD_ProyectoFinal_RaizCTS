/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raiz.rest;

import com.raiz.entidades.Empresa;
import com.raiz.entidades.EmpresaEmpleado;
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
public class Empresa_empleadoRestTest {

    public Empresa_empleadoRestTest() {
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
    public void testInsertEmpresaEmpleador() {
        System.out.println("insertEmpresaEmpleador");
        EmpresaEmpleado empreEmple = null;
        Empresa_empleadoRest instance = new Empresa_empleadoRest();
        String expResult = "";
        String result = instance.insertEmpresaEmpleador(empreEmple);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    //@Test
    public void testGetEmpresas() {
        System.out.println("getEmpresas");
        Empresa_empleadoRest instance = new Empresa_empleadoRest();
        List<EmpresaEmpleado> expResult = null;
        List<EmpresaEmpleado> result = instance.getEmpresas();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindEmpresasAsociadas() {
        System.out.println("findEmpresasAsociadas");
        Integer id = 10;
        Empresa_empleadoRest instance = new Empresa_empleadoRest();
        List<Object> expResult = null;
        List<Empresa> result = instance.findEmpresasAsociadas(id);
        System.out.println("findEmpresasAsociadas: " + result);
    }

}
