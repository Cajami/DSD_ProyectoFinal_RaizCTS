/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raiz.rest;

import com.raiz.entidades.Pais;
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
@Path("pais")
public class PaisRest {

    @EJB
    private Mantenimiento mantenimiento;

    public PaisRest() {
    }

    /*
==============================================================================================================================================
    REST - MANTENIMIENTO PAIS
==============================================================================================================================================
     */
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

}
