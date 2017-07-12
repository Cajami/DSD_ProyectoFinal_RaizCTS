/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raiz.rest;

import com.raiz.entidades.Aprobacion;
import com.raiz.entidades.Cts;
import com.raiz.entidades.Empleado;
import com.raiz.entidades.Empresa;
import com.raiz.entidades.ExcepcionTasa;
import com.raiz.entidades.Pais;
import com.raiz.entidades.Perfil;
import com.raiz.entidades.Usuario;
import com.raiz.negocio.Mantenimiento;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Usuario
 */
@Path("mantenimiento")
public class MantenimientoRest {

    @EJB
    private Mantenimiento mantenimiento;

    /**
     * Creates a new instance of EmpleadoRest
     */
    public MantenimientoRest() {
    }

    /*
==============================================================================================================================================
    REST - MANTENIMIENTO EMPLEADOS
==============================================================================================================================================
     */
    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String insertEmpleado(Empleado empleado) {
        String Rpsta = mantenimiento.registrarEmpleado(empleado);
        return Rpsta;
    }

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Empleado> getEmpleados() {
        return mantenimiento.listarEmpleados();
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Empleado findEmpleado(@PathParam("id") Integer id) {
        return mantenimiento.buscarEmpleado(id);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String editEmpleado(@PathParam("id") Integer id, Empleado empleado) {
        String Rpsta = mantenimiento.actualizarEmpleado(id, empleado);
        return Rpsta;
    }

    @DELETE
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String deleteEmpleado(@PathParam("id") Integer id) {
        String Rpsta = mantenimiento.eliminarEmpleado(id);
        return Rpsta;
    }

    /*
==============================================================================================================================================
    REST - MANTENIMIENTO EMPRESAS
==============================================================================================================================================
     */
   /*    @POST
    @Path("/insertEmpresa/")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String insertEmpresa(Empresa empresa) {
        String Rpsta = mantenimiento.registrarEmpresa(empresa);
        return Rpsta;
    }
  
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Empresa> getEmpresas() {
        return mantenimiento.listarEmpresas();
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Empresa findEmpresa(@PathParam("id") Integer id) {
        return mantenimiento.buscarEmpresa(id);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String editEmpresa(@PathParam("id") Integer id, Empresa empresa) {
        String Rpsta = mantenimiento.actualizarEmpresa(id, empresa);
        return Rpsta;
    }

    @DELETE
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String deleteEmpresa(@PathParam("id") Integer id) {
        String Rpsta = mantenimiento.eliminarEmpresa(id);
        return Rpsta;
    }
     */
 /*
==============================================================================================================================================
    REST - MANTENIMIENTO CTS
==============================================================================================================================================
     */
 /*    
    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String insertCts(Cts cts) {
        String Rpsta = mantenimiento.registrarCts(cts);
        return Rpsta;
    }

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Cts> getCts() {
        return mantenimiento.listarCts();
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Cts findCts(@PathParam("id") Integer id) {
        return mantenimiento.buscarCts(id);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String editCts(@PathParam("id") Integer id, Cts cts) {
        String Rpsta = mantenimiento.actualizarCts(id, cts);
        return Rpsta;
    }

    @DELETE
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String deleteCts(@PathParam("id") Integer id) {
        String Rpsta = mantenimiento.eliminarCts(id);
        return Rpsta;
    }
     */
 /*
==============================================================================================================================================
    REST - MANTENIMIENTO APROBACION
==============================================================================================================================================
     */
 /*
    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String insertAprobacion(Aprobacion aprobacion) {
        String Rpsta = mantenimiento.registrarAprobacion(aprobacion);
        return Rpsta;
    }

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Aprobacion> getAprobaciones() {
        return mantenimiento.listarAprobaciones();
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Aprobacion findAprobacion(@PathParam("id") Integer id) {
        return mantenimiento.buscarAprobacion(id);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String editAprobacion(@PathParam("id") Integer id, Aprobacion aprobacion) {
        String Rpsta = mantenimiento.actualizarAprobacion(id, aprobacion);
        return Rpsta;
    }

    @DELETE
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String deleteAprobacion(@PathParam("id") Integer id) {
        String Rpsta = mantenimiento.eliminarAprobacion(id);
        return Rpsta;
    }
     */
 /*
==============================================================================================================================================
    REST - MANTENIMIENTO EXCEPCION TASA
==============================================================================================================================================
     */
 /*
    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String insertExcepcionTasa(ExcepcionTasa excepcionTasa) {
        String Rpsta = mantenimiento.registrarExcepcionTasa(excepcionTasa);
        return Rpsta;
    }

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<ExcepcionTasa> getExcepcionesTasa() {
        return mantenimiento.listarExcepcionTasa();
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public ExcepcionTasa findExcepcionTasa(@PathParam("id") Integer id) {
        return mantenimiento.buscarExcepcionTasa(id);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String editExcepcionTasa(@PathParam("id") Integer id, ExcepcionTasa excepcionTasa) {
        String Rpsta = mantenimiento.actualizarExcepcionTasa(id, excepcionTasa);
        return Rpsta;
    }

    @DELETE
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String deleteExcepcionTasa(@PathParam("id") Integer id) {
        String Rpsta = mantenimiento.eliminarExcepcionTasa(id);
        return Rpsta;
    }
     */
 /*
==============================================================================================================================================
    REST - MANTENIMIENTO PAIS
==============================================================================================================================================
     */
 /*
    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String insertPais(Pais pais) {
        String Rpsta = mantenimiento.registrarPais(pais);
        return Rpsta;
    }

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Pais> getPaises() {
        return mantenimiento.listarPaises();
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Pais findPais(@PathParam("id") Integer id) {
        return mantenimiento.buscarPais(id);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String editPais(@PathParam("id") Integer id, Pais pais) {
        String Rpsta = mantenimiento.actualizarPais(id, pais);
        return Rpsta;
    }

    @DELETE
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String deletePais(@PathParam("id") Integer id) {
        String Rpsta = mantenimiento.eliminarPais(id);
        return Rpsta;
    }
     */
 /*
==============================================================================================================================================
    REST - MANTENIMIENTO PERFIL
==============================================================================================================================================
     */
 /*
    
    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String insertPerfil(Perfil perfil) {
        String Rpsta = mantenimiento.registrarPerfil(perfil);
        return Rpsta;
    }

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Perfil> getPerfiles() {
        return mantenimiento.listarPerfiles();
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Perfil findPerfil(@PathParam("id") Integer id) {
        return mantenimiento.buscarPerfil(id);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String editPerfil(@PathParam("id") Integer id, Perfil perfil) {
        String Rpsta = mantenimiento.actualizarPerfil(id, perfil);
        return Rpsta;
    }

    @DELETE
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String deletePerfil(@PathParam("id") Integer id) {
        String Rpsta = mantenimiento.eliminarPerfil(id);
        return Rpsta;
    }
     */
 /*
==============================================================================================================================================
    REST - MANTENIMIENTO USUARIOS
==============================================================================================================================================
     */
 /*  
    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String insertUsuario(Usuario usuario) {
        String Rpsta = mantenimiento.registrarUsuario(usuario);
        return Rpsta;
    }

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Usuario> getUsuarios() {
        return mantenimiento.listarUsuarios();
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Usuario findUsuario(@PathParam("id") Integer id) {
        return mantenimiento.buscarUsuario(id);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String editUsuario(@PathParam("id") Integer id, Usuario usuario) {
        String Rpsta = mantenimiento.actualizarUsuario(id, usuario);
        return Rpsta;
    }

    @DELETE
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String deleteUsuario(@PathParam("id") Integer id) {
        String Rpsta = mantenimiento.eliminarUsuario(id);
        return Rpsta;
    }
    
     */
}
