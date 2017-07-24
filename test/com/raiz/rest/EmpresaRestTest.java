/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raiz.rest;

import com.raiz.entidades.Empresa;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JAVIER-PC
 */
public class EmpresaRestTest {

    public EmpresaRestTest() {
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
    public void testInsertEmpresa() {
        System.out.println("insertEmpresa");
        Empresa empresa = null;
        EmpresaRest instance = new EmpresaRest();
        String expResult = "";
        String result = instance.insertEmpresa(empresa);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetEmpresas() {
        System.out.println("getEmpresas");
        EmpresaRest instance = new EmpresaRest();
        List<Empresa> expResult = null;
        List<Empresa> result = instance.getEmpresas();
        System.out.println("getEmpresas: " + result);
    }

    //@Test
    public void testFindEmpresa() {
        System.out.println("findEmpresa");
        Integer id = null;
        EmpresaRest instance = new EmpresaRest();
        Empresa expResult = null;
        Empresa result = instance.findEmpresa(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    //@Test
    public void testEditEmpresa() {
        System.out.println("editEmpresa");
        Integer id = null;
        Empresa empresa = null;
        EmpresaRest instance = new EmpresaRest();
        String expResult = "";
        String result = instance.editEmpresa(id, empresa);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    //@Test
    public void testDeleteEmpresa() {
        System.out.println("deleteEmpresa");
        Integer id = null;
        EmpresaRest instance = new EmpresaRest();
        String expResult = "";
        String result = instance.deleteEmpresa(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

}
