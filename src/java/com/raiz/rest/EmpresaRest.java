/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raiz.rest;

import com.raiz.entidades.Empresa;
import com.raiz.negocio.Mantenimiento;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author JAVIER-PC
 */
@Path("empresa")
public class EmpresaRest {

    @EJB
    private Mantenimiento mantenimiento;

    public EmpresaRest() {
    }

    /*
==============================================================================================================================================
    REST - MANTENIMIENTO EMPRESAS
==============================================================================================================================================
     */
    @POST
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

}
