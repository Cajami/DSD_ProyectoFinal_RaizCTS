/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raiz.rest;

import com.raiz.entidades.Cts;
import com.raiz.entidades.CtsSelect;
import com.raiz.negocio.Mantenimiento;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
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
 * @author Usuario
 */
@Path("cts")
public class CtsRest {

    @EJB
    private Mantenimiento mantenimiento;

    /**
     * Creates a new instance of CtsRest
     */
    public CtsRest() {
    }

    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String insertCts(Cts cts) {
        String Rpsta = mantenimiento.registrarCts(cts);
        return Rpsta;
    }

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<CtsSelect> getCts() {
        return mantenimiento.listarCts();
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public CtsSelect findCts(@PathParam("id") Integer id) {
        return mantenimiento.buscarCts(id);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String editCts(@PathParam("id") Integer id, Cts cts) {
        String Rpsta = mantenimiento.actualizarCts(id, cts);
        return Rpsta;
    }
}
