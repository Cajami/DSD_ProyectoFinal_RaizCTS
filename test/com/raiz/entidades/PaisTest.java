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
 * @author FAUSEN
 */
public class PaisTest {
    
    public PaisTest() {
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
    public void testNuevoPais() {
        System.out.println("testNuevoPais");
        Pais pais = new Pais();
        pais.setCodigoPais(3);
        pais.setDescripcion("GUATEMALA");
        Integer expResult = 3;
        Integer result = pais.getCodigoPais();
        assertEquals(expResult, result);
        //System.out.print(result + "registrado");
        
    }
    
}
