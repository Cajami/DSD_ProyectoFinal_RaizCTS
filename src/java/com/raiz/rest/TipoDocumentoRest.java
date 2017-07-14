/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raiz.rest;

import com.raiz.entidades.Empleado;
import com.raiz.entidades.TipoDocumento;
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
@Path("tipoDocumento")
public class TipoDocumentoRest {

    @EJB
    private Mantenimiento mantenimiento;

    public TipoDocumentoRest() {
    }

    /*
==============================================================================================================================================
    REST - MANTENIMIENTO TIPO DOCUMENTO
==============================================================================================================================================
     */
    
    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String insertTipoDocumento(TipoDocumento tipoDocumento) {
        String Rpsta = mantenimiento.registrarTipoDocumento(tipoDocumento);
        return Rpsta;
    }

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<TipoDocumento> getTipoDocumentos() {
        return mantenimiento.listarTipoDocumentos();
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public TipoDocumento findEmpleado(@PathParam("id") Integer id) {
        return mantenimiento.buscarTipoDocumento(id);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String editTipoDocumento(@PathParam("id") Integer id, TipoDocumento tipoDocumento) {
        String Rpsta = mantenimiento.actualizarTipoDocumento(id, tipoDocumento);
        return Rpsta;
    }

    @DELETE
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String deleteTipoDocumento(@PathParam("id") Integer id) {
        String Rpsta = mantenimiento.eliminarTipoDocumento(id);
        return Rpsta;
    }
    
}
