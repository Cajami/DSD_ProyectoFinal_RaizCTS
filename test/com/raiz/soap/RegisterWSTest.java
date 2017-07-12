/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raiz.soap;

import javax.ejb.embeddable.EJBContainer;
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
public class RegisterWSTest {

    public RegisterWSTest() {
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
    public void testRegistrarEmpresa() throws Exception {
        System.out.println("registrarEmpresa");
        String nombreEmpresa = "ANTAMINA";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        RegisterWS instance = (RegisterWS) container.getContext().lookup("java:global/classes/RegisterWS");
        String expResult = "";
        String result = instance.registrarEmpresa(nombreEmpresa);
        System.out.println("Resultado = " + result);
        //assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testRegistrarPais() throws Exception {
        System.out.println("registrarPais");
        String nombrePais = "BOLIVIA";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        RegisterWS instance = (RegisterWS) container.getContext().lookup("java:global/classes/RegisterWS");
        String expResult = "";
        String result = instance.registrarPais(nombrePais);
        System.out.println("Resultado = " + result);

        //assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testRegistrarPerfil() throws Exception {
        System.out.println("registrarPerfil");
        String nombrePerfil = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        RegisterWS instance = (RegisterWS) container.getContext().lookup("java:global/classes/RegisterWS");
        String expResult = "";
        String result = instance.registrarPerfil(nombrePerfil);
        System.out.println("Resultado = " + result);
        //assertEquals(expResult, result);
        container.close();
    }

}
