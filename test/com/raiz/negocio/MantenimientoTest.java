/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raiz.negocio;

import com.raiz.entidades.Aprobacion;
import com.raiz.entidades.Cts;
import com.raiz.entidades.Empleado;
import com.raiz.entidades.Empresa;
import com.raiz.entidades.ExcepcionTasa;
import com.raiz.entidades.Pais;
import com.raiz.entidades.Perfil;
import com.raiz.entidades.Usuario;
import java.text.SimpleDateFormat;
import java.util.List;
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
public class MantenimientoTest {

    public MantenimientoTest() {
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
    public void testRegistrarEmpleado() throws Exception {//=======> PRUEBA OK
        System.out.println("registrarEmpleado");

        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");

        Empleado empleado = new Empleado();

        empleado.setCodigoPais(1);
        empleado.setCodigoTipdoc(1);
        empleado.setNroDoc("42584875");
        empleado.setApellidoPaterno("PINTO");
        empleado.setApellidoMaterno("LOACES");
        empleado.setNombres("XXXXXXX");
        empleado.setFechaNacimiento("12/08/1980");
        empleado.setDomicilio("JR VILLAR CONTRALMIRANTE 478 Int: D");
        empleado.setEmail("pintoloaces@gmail.com");

        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        String expResult = "";
        Integer result = instance.registrarEmpleado(empleado);
        System.out.println("Resultado: " + result);
        //assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testListarEmpleados() throws Exception {//=======> PRUEBA OK
        System.out.println("listarEmpleados");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        List<Empleado> expResult = null;
        List<Empleado> result = instance.listarEmpleados();
        System.out.println("Resultado: " + result);
        //assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testBuscarEmpleado() throws Exception {//=======> PRUEBA OK
        System.out.println("buscarEmpleado");
        Integer idEmpleado = 2;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        Empleado expResult = null;
        Empleado result = instance.buscarEmpleado(idEmpleado);
        System.out.println("Resultado: " + result);
        //assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testActualizarEmpleado() throws Exception {//=======> PRUEBA OK
        System.out.println("actualizarEmpleado");
        int idEmpleado = 2;

        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");

        Empleado empleado = new Empleado();

        empleado.setCodigoPais(1);
        empleado.setCodigoTipdoc(1);
        empleado.setNroDoc("42584875");
        empleado.setApellidoPaterno("PINTO");
        empleado.setApellidoMaterno("LOACES");
        empleado.setNombres("RICARDO AUGUSTO");
        empleado.setFechaNacimiento("18/11/1985");
        empleado.setDomicilio("JR VILLAR CONTRALMIRANTE 478 Int: D");
        empleado.setEmail("pintoloaces@gmail.com");

        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        String expResult = "";
        String result = instance.actualizarEmpleado(idEmpleado, empleado);
        System.out.println("Resultado: " + result);
        //assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testEliminarEmpleado() throws Exception {//=======> PARA PREGUNTARLE AL PROFESOR PORQUE NO ELIMINAR REGISTRO DE LA BASE DE DATOS
        System.out.println("eliminarEmpleado");
        int idEmpleado = 3;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        String expResult = "";
        String result = instance.eliminarEmpleado(idEmpleado);
        System.out.println("Resultado: " + result);
        //assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testRegistrarEmpresa() throws Exception {
        System.out.println("registrarEmpresa");
        Empresa empresa = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        String expResult = "";
        String result = instance.registrarEmpresa(empresa);
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testListarEmpresas() throws Exception {
        System.out.println("listarEmpresas");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        List<Empresa> expResult = null;
        List<Empresa> result = instance.listarEmpresas();
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testBuscarEmpresa() throws Exception {
        System.out.println("buscarEmpresa");
        Integer idEmpresa = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        Empresa expResult = null;
        Empresa result = instance.buscarEmpresa(idEmpresa);
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testActualizarEmpresa() throws Exception {
        System.out.println("actualizarEmpresa");
        int idEmpresa = 0;
        Empresa empresa = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        String expResult = "";
        String result = instance.actualizarEmpresa(idEmpresa, empresa);
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testEliminarEmpresa() throws Exception {
        System.out.println("eliminarEmpresa");
        int idEmpresa = 0;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        String expResult = "";
        String result = instance.eliminarEmpresa(idEmpresa);
        assertEquals(expResult, result);
        container.close();
    }

    @Test
    public void testRegistrarCts() throws Exception {
        System.out.println("registrarCts");
        //Cts cts = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        String expResult = "";
        String result = instance.registrarCts(1,7,0);
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testListarCts() throws Exception {
        System.out.println("listarCts");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        List<Cts> expResult = null;
        List<Cts> result = instance.listarCts();
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testBuscarCts() throws Exception {
        System.out.println("buscarCts");
        Integer idCts = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        Cts expResult = null;
        Cts result = instance.buscarCts(idCts);
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testActualizarCts() throws Exception {
        System.out.println("actualizarCts");
        int idCts = 0;
        Cts cts = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        String expResult = "";
        String result = instance.actualizarCts(idCts, cts);
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testEliminarCts() throws Exception {
        System.out.println("eliminarCts");
        int idCts = 0;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        String expResult = "";
        String result = instance.eliminarCts(idCts);
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testRegistrarAprobacion() throws Exception {
        System.out.println("registrarAprobacion");
        Aprobacion aprobacion = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        String expResult = "";
        String result = instance.registrarAprobacion(aprobacion);
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testListarAprobaciones() throws Exception {
        System.out.println("listarAprobaciones");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        List<Aprobacion> expResult = null;
        List<Aprobacion> result = instance.listarAprobaciones();
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testBuscarAprobacion() throws Exception {
        System.out.println("buscarAprobacion");
        Integer idAprobacion = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        Aprobacion expResult = null;
        Aprobacion result = instance.buscarAprobacion(idAprobacion);
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testActualizarAprobacion() throws Exception {
        System.out.println("actualizarAprobacion");
        int idAprobacion = 0;
        Aprobacion aprobacion = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        String expResult = "";
        String result = instance.actualizarAprobacion(idAprobacion, aprobacion);
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testEliminarAprobacion() throws Exception {
        System.out.println("eliminarAprobacion");
        int idAprobacion = 0;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        String expResult = "";
        String result = instance.eliminarAprobacion(idAprobacion);
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testRegistrarExcepcionTasa() throws Exception {
        System.out.println("registrarExcepcionTasa");
        ExcepcionTasa excepcionTasa = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        String expResult = "";
        String result = instance.registrarExcepcionTasa(excepcionTasa);
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testListarExcepcionTasa() throws Exception {
        System.out.println("listarExcepcionTasa");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        List<ExcepcionTasa> expResult = null;
        List<ExcepcionTasa> result = instance.listarExcepcionTasa();
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testBuscarExcepcionTasa() throws Exception {
        System.out.println("buscarExcepcionTasa");
        Integer idExcepcionTasa = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        ExcepcionTasa expResult = null;
        ExcepcionTasa result = instance.buscarExcepcionTasa(idExcepcionTasa);
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testActualizarExcepcionTasa() throws Exception {
        System.out.println("actualizarExcepcionTasa");
        int idExcepcionTasa = 0;
        ExcepcionTasa excepcionTasa = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        String expResult = "";
        String result = instance.actualizarExcepcionTasa(idExcepcionTasa, excepcionTasa);
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testEliminarExcepcionTasa() throws Exception {
        System.out.println("eliminarExcepcionTasa");
        int idExcepcionTasa = 0;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        String expResult = "";
        String result = instance.eliminarExcepcionTasa(idExcepcionTasa);
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testRegistrarPais() throws Exception {
        System.out.println("registrarPais");
        Pais pais = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        String expResult = "";
        String result = instance.registrarPais(pais);
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testListarPaises() throws Exception {
        System.out.println("listarPaises");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        List<Pais> expResult = null;
        List<Pais> result = instance.listarPaises();
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testBuscarPais() throws Exception {
        System.out.println("buscarPais");
        Integer idPais = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        Pais expResult = null;
        Pais result = instance.buscarPais(idPais);
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testActualizarPais() throws Exception {
        System.out.println("actualizarPais");
        int idPais = 0;
        Pais pais = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        String expResult = "";
        String result = instance.actualizarPais(idPais, pais);
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testEliminarPais() throws Exception {
        System.out.println("eliminarPais");
        int idPais = 0;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        String expResult = "";
        String result = instance.eliminarPais(idPais);
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testRegistrarPerfil() throws Exception {
        System.out.println("registrarPerfil");
        Perfil perfil = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        String expResult = "";
        String result = instance.registrarPerfil(perfil);
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testListarPerfiles() throws Exception {
        System.out.println("listarPerfiles");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        List<Perfil> expResult = null;
        List<Perfil> result = instance.listarPerfiles();
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testBuscarPerfil() throws Exception {
        System.out.println("buscarPerfil");
        Integer idPerfil = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        Perfil expResult = null;
        Perfil result = instance.buscarPerfil(idPerfil);
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testActualizarPerfil() throws Exception {
        System.out.println("actualizarPerfil");
        int idPerfil = 0;
        Perfil perfil = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        String expResult = "";
        String result = instance.actualizarPerfil(idPerfil, perfil);
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testEliminarPerfil() throws Exception {
        System.out.println("eliminarPerfil");
        int idPerfil = 0;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        String expResult = "";
        String result = instance.eliminarPerfil(idPerfil);
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testRegistrarUsuario() throws Exception {
        System.out.println("registrarUsuario");
        Usuario usuario = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        String expResult = "";
        String result = instance.registrarUsuario(usuario);
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testListarUsuarios() throws Exception {
        System.out.println("listarUsuarios");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        List<Usuario> expResult = null;
        List<Usuario> result = instance.listarUsuarios();
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testBuscarUsuario() throws Exception {
        System.out.println("buscarUsuario");
        Integer idUsuario = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        Usuario expResult = null;
        Usuario result = instance.buscarUsuario(idUsuario);
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testActualizarUsuario() throws Exception {
        System.out.println("actualizarUsuario");
        int idUsuario = 0;
        Usuario usuario = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        String expResult = "";
        String result = instance.actualizarUsuario(idUsuario, usuario);
        assertEquals(expResult, result);
        container.close();
    }

    //@Test
    public void testEliminarUsuario() throws Exception {
        System.out.println("eliminarUsuario");
        int idUsuario = 0;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        Mantenimiento instance = (Mantenimiento) container.getContext().lookup("java:global/classes/Mantenimiento");
        String expResult = "";
        String result = instance.eliminarUsuario(idUsuario);
        assertEquals(expResult, result);
        container.close();
    }

}
